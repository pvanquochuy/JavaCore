package Lamda.example23;

import java.util.Arrays;
import java.util.List;

public class AverageStringLengthLambda {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "mango");

        double averageLength = strings.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);

        System.out.println("Average length of strings: " + averageLength);
    }
}
