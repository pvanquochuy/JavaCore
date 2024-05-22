package Stream.CountStringsStartingWithLetter;

import java.util.Arrays;
import java.util.List;

public class CountStringsStartingWithLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "orange", "grape", "apricot", "pear");

        char startingLetter = 'a';
        long count = words.stream()
                .filter(word -> word.charAt(0) == startingLetter)
                .count();

        System.out.println(count);
    }
}
