package Stream.MinMaxValues;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxValues {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> minValue = numbers.stream()
                .min((a, b) -> a.compareTo(b));

        Optional<Integer> maxValue = numbers.stream()
                .max((a, b) -> a.compareTo(b));

        System.out.println(minValue.get());
        System.out.println(maxValue.get());
    }
}
