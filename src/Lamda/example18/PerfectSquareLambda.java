package Lamda.example18;

import java.util.function.Predicate;

public class PerfectSquareLambda {
    public static void main(String[] args) {
        int number1 = 16;
        int number2 = 20;

        Predicate<Integer> isPerfectSquare = n -> Math.sqrt(n) % 1 == 0;

        if (isPerfectSquare.test(number1)) {
            System.out.println(number1 + " is a perfect square.");
        } else {
            System.out.println(number1 + " is not a perfect square.");
        }
        if (isPerfectSquare.test(number2)) {
            System.out.println(number2 + " is a perfect square.");
        } else {
            System.out.println(number2 + " is not a perfect square.");
        }
    }
}
