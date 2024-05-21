import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class SumOfPrimesLambda {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;

        // Lambda expression to check if a number is prime
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

        // Calculate sum of prime numbers using lambda expression
        int sumOfPrimes = IntStream.rangeClosed(start, end)
                .filter(isPrime)
                .sum();

        System.out.println("Sum of prime numbers between " + start + " and " + end + ": " + sumOfPrimes);
    }
}
