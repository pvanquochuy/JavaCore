package Lamda.example6;

import java.util.ArrayList;
import java.util.List;

public class AverageCalculator {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();

        doubles.add(2.4);
        doubles.add(3.2);
        doubles.add(2.0);
        doubles.add(2.4);

        double averageValue = doubles.stream().mapToDouble(d -> d.doubleValue()).average().orElse(0.0);

        System.out.println("Average value: " + averageValue);
    }
}
