package MyThread.example6;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.concurrent.ExecutorService;
import java.util.Set;
import java.io.IOException;

public class WebCrawlerTask implements Runnable {
    private final String url;
    private final Set<String> visitedUrls;
    private final ExecutorService executor;

    public WebCrawlerTask(String url, Set<String> visitedUrls, ExecutorService executor) {
        this.url = url;
        this.visitedUrls = visitedUrls;
        this.executor = executor;
    }

    @Override
    public void run() {
        if (executor.isShutdown()) {
            return; // Do nothing if the executor is shutting down
        }
        if(visitedUrls.contains(url)){
            return;
        }
        synchronized (visitedUrls) {
            if(visitedUrls.contains(url)){
                return;
            }
            visitedUrls.add(url);
        }
        System.out.println("Crawling: " + url);
        try{
            Document doc = Jsoup.connect(url).get();
            String title = doc.title(); // Lấy tiêu đề của trang web
            System.out.println("Title of " + url + ": " + title);

            for(Element link : doc.select("a[href]")){
                String nextUrl = link.absUrl("href");
                System.out.println("Crawling URL: " + nextUrl);
                if(!nextUrl.isEmpty() && !visitedUrls.contains(nextUrl)){
                    executor.execute(new WebCrawlerTask(nextUrl, visitedUrls, executor));
                }
            }
        }
        catch(IOException e){
            System.out.println("Error fetching urls: " + url);
            e.printStackTrace();
        }
    }

}
