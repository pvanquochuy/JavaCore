package MyThread.example2;

public class EvenThread extends Thread {
    public void run() {
        for(int i = 2; i <= 20; i += 2){
            System.out.println("Even Thread: " + i);
        }
    }
}
