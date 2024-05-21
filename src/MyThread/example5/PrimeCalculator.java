package MyThread.example5;

public class PrimeCalculator extends Thread{
    private final int start;
    private final int end;
    private long sum;

    public PrimeCalculator(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
    public void run(){
        for(int num = start; num <= end; num++){
            if(isPrime(num)){
                sum += num;
            }
        }
    }
    private boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public long getSum(){
        return sum;
    }
}
