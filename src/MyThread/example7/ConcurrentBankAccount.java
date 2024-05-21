package MyThread.example7;

public class ConcurrentBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        // Create threads for concurrent deposits and withdrawals
        Thread[] threads = new Thread[10];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new TransactionThread(account, i % 2 == 0, Math.random() * 500); //Half deposit, half withdraw
        }
        // start threads
        for(Thread thread : threads){
            thread.start();
        }
        // wait for all threads to finish
        try{
            for(Thread thread : threads){
                thread.join();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        // print final balance
        System.out.println("Final balance: " + account.getBalance());
    }
}
