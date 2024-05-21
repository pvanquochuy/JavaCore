package Lamda.example1;

public class Main {
    public static void main(String[] args) {
        SumCaculator caculator = (a, b) -> a + b;

        System.out.println(caculator.sum(3, 10));
    }
}
