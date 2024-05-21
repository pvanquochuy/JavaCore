package Lamda.example24;

import java.util.function.IntPredicate;

public class LargestPrimeFactorLambda {
    public static void main(String[] args){
        int number = 315;
        IntPredicate isPrime = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int largestPrimeFactor = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && isPrime.test(i)) {
                largestPrimeFactor = i;
            }
        }

        if (largestPrimeFactor != 0) {
            System.out.println("Largest prime factor of " + number + " is: " + largestPrimeFactor);
        } else {
            System.out.println("There is no prime factor for " + number);
        }
    }
}
