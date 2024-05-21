package MyThread.example3;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = {9, 7, 3, 5, 1, 8, 2, 6, 4};
        int half = array.length / 2;

        int[] firstHalf = Arrays.copyOfRange(array, 0, half);
        int[] secondHalf = Arrays.copyOfRange(array, half, array.length);

        SortThread sort1 =  new SortThread(firstHalf);
        SortThread sort2 =  new SortThread(secondHalf);

        sort1.start();
        sort2.start();

        try{
            sort1.join();
            sort2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        merge(array, firstHalf, secondHalf);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
    private static void merge(int[] array, int[] firstHalf, int[] secondHalf) {
        int i = 0, j = 0, k = 0;
        while (i < firstHalf.length && j < secondHalf.length) {
            if (firstHalf[i] < secondHalf[j]) {
                array[k++] = firstHalf[i++];
            } else {
                array[k++] = secondHalf[j++];
            }
        }
        while (i < firstHalf.length) {
            array[k++] = firstHalf[i++];
        }
        while (j < secondHalf.length) {
            array[k++] = secondHalf[j++];
        }
    }

}
