package Lamda.example14;

import java.util.function.Predicate;

public class PalindromeLambda {
    public static void main(String[] args){
        String str1 = "radar";
        String str2 = "hello";

        Predicate<String> isPalindrome = (str)->{
            String reverse = new StringBuilder(str).reverse().toString();
            return str.equals(reverse);
        };

        if(isPalindrome.test(str1)){
            System.out.println(str1 + " is palindrome");
        }else{
            System.out.println(str1 + " is not palindrome");
        }
        if(isPalindrome.test(str2)){
            System.out.println(str2 + " is palindrome");
        }else{
            System.out.println(str2 + " is not palindrome");
        }


    }
}
