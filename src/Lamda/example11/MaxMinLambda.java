package Lamda.example11;

import java.util.Arrays;
import java.util.List;

public class MaxMinLambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3,4 ,3 , -1, 10);

        int max = numbers.stream().max((a, b) -> a.compareTo(b)).get();
        int min = numbers.stream().min((a, b) -> a.compareTo(b)).get();

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
