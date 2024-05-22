package Stream.ConvertString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ConvertString {
    public static void main(String[] args) {
        List<String> strings1 = Arrays.asList("hello", "world", "java", "streams");
        List<String> strings2 = Arrays.asList("HELLO", "WORLD", "JAVA", "STREAMS");

        List<String> stringToUpperCase = strings1.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()); // // Thu thập kết quả thành một danh sách

        List<String> stringToLowerCase = strings2.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList()); // // Thu thập kết quả thành một danh sách

        System.out.println(stringToUpperCase);

        System.out.println(stringToLowerCase);



    }
}
