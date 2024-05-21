package Lamda.example16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class WordSearchLambda {
    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "mango");

        //check
        String targetWord = "orange";
        Predicate<List<String>> containsWord = list -> list.stream().anyMatch(word -> word.equals(targetWord));
        if(containsWord.test(words)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
