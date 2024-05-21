package MyThread.example6;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentWebCrawler {
    public static void main(String[] args) {
        String startUrl = "http://www.javatpoint.com";
        Set<String> visitedUrls = new HashSet<String>();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        executor.execute(new WebCrawlerTask(startUrl, visitedUrls, executor));
        executor.shutdown();
        try{
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println("Crawling completed");

    }
}
