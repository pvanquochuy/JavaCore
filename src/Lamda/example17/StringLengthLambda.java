package Lamda.example17;

import java.util.Arrays;
import java.util.List;

public class StringLengthLambda {
    public static void main(String[] args){
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "mango");

        int maxLength = strings.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        int minLength = strings.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);

        System.out.println("Length of the longest string: " + maxLength);
        System.out.println("Length of the smallest string: " + minLength);
    }
}
