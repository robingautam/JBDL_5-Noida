package Synchronization;

public class Person {

    public int balance;

    public  void withdraw(int amount){
        synchronized (this) {
            this.balance = this.balance - amount;
        }
        printBalance();
    }

    public void printBalance(){
        System.out.println("Balance: "+this.balance+" "+Thread.currentThread().getName());
    }
}
