package Lamda.example13;

import java.util.Arrays;
import java.util.List;

public class WordCountLambda {
    public static void main(String[] args) {
        String sentence = "This is a sentence";

        // Split the sentence into words
        List<String> words = Arrays.asList(sentence.split(" "));
        // Lambda expression to count words
        long wordCount = words.stream().count();

        System.out.println(words.size() + " words");
    }
}
