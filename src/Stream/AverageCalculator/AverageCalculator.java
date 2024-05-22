package Stream.AverageCalculator;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
public class AverageCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 23, 34, 90);

        OptionalDouble average = numbers.stream()
                .mapToInt(i -> i.intValue()) // (Integer:intValue)
                .average();

        if(average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        }else{
            System.out.println("List is empty");
        }
    }
}
