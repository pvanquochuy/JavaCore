package Lamda.example5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("grape");

        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted list:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
