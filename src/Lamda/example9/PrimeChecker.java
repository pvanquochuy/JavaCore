package Lamda.example9;

import java.util.function.IntPredicate;

public class PrimeChecker {
    public static void main(String[] args) {
        IntPredicate predicate = n -> {
            if(n <= 1){
                return false;
            }
            for(int i = 2; i< Math.sqrt(n); i++) {
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        };

        //
        int number = 17;
        boolean result = predicate.test(number);
        if(result){
            System.out.println(number + " is prime");
        }else{
            System.out.println(number + " is not prime");
        }
    }
}
