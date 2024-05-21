package Lamda.example7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6,7, 7, 8);
        // Removing duplicates using lambda expression
        List<Integer> uniqueNumber = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("List without unique numbers: " + uniqueNumber);

    }
}
