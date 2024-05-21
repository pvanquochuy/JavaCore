package MyThread.example5;

public class Main {
    public static void main(String[] args) {
        int limit = 12;
        int numThread = 4;

        int numbersPerThread = limit / numThread;
        int start = 1;
        int end = numbersPerThread;

        PrimeCalculator[] calculators  = new PrimeCalculator[numThread];
        for (int i = 0; i < numThread; i++){
            if(i == numThread - 1){
                end = limit;
            }
            calculators[i] = new PrimeCalculator(start, end);
            calculators[i].start();
            start = end + 1;
            end += numbersPerThread;
        }
        long total = 0;
        for(PrimeCalculator calculator : calculators){
            try{
                calculator.join();
                total += calculator.getSum();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Sum of prime numbers up to " + limit + ": " + total);
    }
}
