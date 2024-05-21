package MyThread.example7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final Lock lock = new ReentrantLock();

    public BankAccount(double balance) {
        this.balance = balance;
    }
    // Gửi tien
    public void despoint(double amount){
        lock.lock();
        try{
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited " + amount + "balance is now " + balance);
        }
         finally{
            lock.unlock();
        }
    }
    // rut tien
    public void withdraw(double amount){
        lock.lock();
        try{
            if(balance >= amount){
                balance = -amount;
                System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", balance is now" +  balance);
            }else{
                System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + ", but balance is insufficient ");
            }
        } finally{
            lock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }
}
