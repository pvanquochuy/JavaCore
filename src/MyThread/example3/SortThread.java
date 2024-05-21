package MyThread.example3;

import java.util.Arrays;

public class SortThread extends Thread {
    private int[] array;

    public SortThread(int[] array) {
        this.array = array;
    }
    public void run() {
        Arrays.sort(array);
    }
}
