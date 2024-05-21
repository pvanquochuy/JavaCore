package Lamda.example19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargestSmallestLambda {

    public static void main(String[] args){
        int[] array = {5, 8, 2, 10, 3, 7, 1, 6, 9, 4};

        Optional<Integer> secondLargest = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        Optional<Integer> secondSmallest = Arrays.stream(array)
                .boxed()
                .sorted()
                .skip(1)
                .findFirst();

        if (secondLargest.isPresent()) {
            System.out.println("Second largest element: " + secondLargest.get());
        } else {
            System.out.println("No second largest element found.");
        }

        if (secondSmallest.isPresent()) {
            System.out.println("Second smallest element: " + secondSmallest.get());
        } else {
            System.out.println("No second smallest element found.");
        }
    }

}
