package Synchronization;

public class BankThread extends Thread{

    Person person;

    BankThread(Person person){
        this.person = person;
    }

    @Override
    public void run(){
        person.withdraw(30);
    }
}
