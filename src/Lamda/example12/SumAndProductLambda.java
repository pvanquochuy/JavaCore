package Lamda.example12;

import java.util.Arrays;
import java.util.List;

public class SumAndProductLambda {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int product = numbers.stream().reduce(1, (a,b) -> a * b);

        int sum = numbers.stream().reduce(0, Integer::sum);

        System.out.println("Product of all elements: " + product);
        System.out.println("Sum of all elements: " + sum);
    }
}
