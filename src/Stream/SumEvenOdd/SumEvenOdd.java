package Stream.SumEvenOdd;

import java.util.Arrays;
import java.util.List;

public class SumEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int evenValue = numbers.stream()
                .filter(n -> n %2 == 0)
                .mapToInt(i -> i.intValue())
                .sum();

        int oddValue = numbers.stream()
                .filter(n -> n %2 != 0)
                .mapToInt(i -> i.intValue())
                .sum();
        System.out.println(evenValue);
        System.out.println(oddValue);
    }
}
