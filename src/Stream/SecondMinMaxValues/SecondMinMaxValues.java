package Stream.SecondMinMaxValues;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondMinMaxValues {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 8, 25);

        Optional<Integer> sencondMinValue = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();
        Optional<Integer> sencondMaxValue = numbers.stream()
                .distinct()
                .sorted((a,b) -> b.compareTo(a))
                .skip(1)
                .findFirst();


        System.out.println(sencondMinValue.get());
        System.out.println(sencondMaxValue.get());



    }
}
