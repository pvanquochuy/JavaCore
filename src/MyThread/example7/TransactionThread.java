package MyThread.example7;

public class TransactionThread extends Thread {
    private final BankAccount account;
    private final boolean deposit;
    private final double amount;

    public TransactionThread(BankAccount account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if(deposit){
            account.despoint(amount);
        }else{
            account.withdraw(amount);
        }
    }



}

