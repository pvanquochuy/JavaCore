package Lamda.example15;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresLambda {

   public static void main(String[] args){
       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       int sumOfSquaresOfOdd = numbers.stream()
               .filter(n -> n % 2 != 0)
               .mapToInt(n -> n * n)
               .sum();
       int sumOfSquaresOfEven = numbers.stream()
               .filter(n -> n % 2 == 0)
               .mapToInt(n -> n * n)
               .sum();
       System.out.println("Sum of squares of odd numbers: " + sumOfSquaresOfOdd);
       System.out.println("Sum of squares of even numbers: " + sumOfSquaresOfEven);
   }
}
