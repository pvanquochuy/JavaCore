package Lamda.example8;

import java.util.function.IntUnaryOperator;

public class FactorialCalculator{
    public static void main(String[] args){
        IntUnaryOperator factorial = n -> {
            int result = 1;
            for(int i = 2; i <= n; i++){
                result *= i;
            }
            return result;
        };

        int number = 5;
        int factorialOfNumber = factorial.applyAsInt(number);
        System.out.println("Factorial: " + number + " = " + factorialOfNumber);
    }
}
