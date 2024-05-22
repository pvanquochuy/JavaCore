package Stream.SortStrings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "orange", "grape", "pear");

        List<String> ascendingOrder = words.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> descendingOrder  = words.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        System.out.println(ascendingOrder);
        System.out.println(descendingOrder);


    }
}
