package Lamda.example2;

public class LambdaStringCheck {
    public static void main(String[] args){
        StringChecker check = str -> str.isEmpty();

        String str1 = "";
        String str2 = "Hello";

        boolean isEmptyStr1 = check.isEmpty(str1);
        boolean isEmptyStr2 = check.isEmpty(str2);

        System.out.println("Is '" + str1 + "' empty? " + isEmptyStr1);
        System.out.println("Is '" + str2 + "' empty? " + isEmptyStr2);
    }
}
