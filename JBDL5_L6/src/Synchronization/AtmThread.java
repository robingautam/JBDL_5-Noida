package Synchronization;

import javax.management.OperationsException;

public class AtmThread extends Thread{

    Person person;

    AtmThread(Person person){
        this.person = person;
    }

    @Override
    public void run(){
        person.withdraw(20);
    }
}
