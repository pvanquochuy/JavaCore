package Lamda.example22;

import java.util.List;
import java.util.function.Predicate;

public class CaseCheckLambda {
    public static void main(String[] args){
        List<String> strings1 = List.of("HELLO", "WORLD", "HOW", "ARE", "YOU");
        List<String> strings2 = List.of("hello", "world", "how", "are", "you");
        List<String> strings3 = List.of("Hello", "WoRlD", "HoW", "ArE", "YoU");

        // uppercase
        Predicate<List<String>> allUppercase = list -> list.stream().allMatch(s -> s.matches("[A-Z]+"));
        // lowercase
        Predicate<List<String>> allLowercase = list -> list.stream().allMatch(s -> s.matches("[a-z]+"));
        // mixed case
        Predicate<List<String>> mixedCase = list -> !allUppercase.test(list) && !allLowercase.test(list);
        // Check case for strings1
        if (allUppercase.test(strings1)) {
            System.out.println("All strings in strings1 are uppercase.");
        } else if (allLowercase.test(strings1)) {
            System.out.println("All strings in strings1 are lowercase.");
        } else if (mixedCase.test(strings1)) {
            System.out.println("strings1 contains mixed case strings.");
        }

        // Check case for strings2
        if (allUppercase.test(strings2)) {
            System.out.println("All strings in strings2 are uppercase.");
        } else if (allLowercase.test(strings2)) {
            System.out.println("All strings in strings2 are lowercase.");
        } else if (mixedCase.test(strings2)) {
            System.out.println("strings2 contains mixed case strings.");
        }

        // Check case for strings3
        if (allUppercase.test(strings3)) {
            System.out.println("All strings in strings3 are uppercase.");
        } else if (allLowercase.test(strings3)) {
            System.out.println("All strings in strings3 are lowercase.");
        } else if (mixedCase.test(strings3)) {
            System.out.println("strings3 contains mixed case strings.");
        }
    }
}
