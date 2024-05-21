package Lamda.example10;

import java.util.function.BinaryOperator;

public class StringConcatenator {
    public static void main(String[] args) {
        BinaryOperator<String> concatenateStrings  = (str1, str2) -> str1 + " " + str2;

        String firstString = "hello";
        String secondString = "world";

        String result = concatenateStrings.apply(firstString, secondString);
        System.out.println(result);
    }
}
