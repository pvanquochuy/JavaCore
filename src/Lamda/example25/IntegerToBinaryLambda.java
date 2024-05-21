package Lamda.example25;

import java.util.function.Function;

public class IntegerToBinaryLambda {
    public static void main(String[] args){
        int number = 1012;

        Function<Integer, String> toBinary = n -> Integer.toBinaryString(n);

        String binaryRepresentation = toBinary.apply(number);
        System.out.println("Binary representation of " + number + " is: " + binaryRepresentation);
    }
}
