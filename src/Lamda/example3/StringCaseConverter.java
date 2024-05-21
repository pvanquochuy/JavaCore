package Lamda.example3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringCaseConverter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("Goodbye");
        strings.add("Thanks");

        List<String> uppercaseStrings = convertStrings(strings, str -> str.toUpperCase());
        List<String> lowercaseStrings  = convertStrings(strings, str -> str.toLowerCase());

        System.out.println("Uppercase Strings: " + uppercaseStrings);
        System.out.println("Lowercase Strings: " + lowercaseStrings);

    }
    public static List<String> convertStrings(List<String> strings, Function<String, String> converter) {
        List<String> result = new ArrayList<>();
        for(String str: strings) {
            result.add(converter.apply(str));
        }
        return result;
    }
}
