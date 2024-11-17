package Synchronization;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.balance = 100;
        AtmThread atmThread = new AtmThread(person);
        BankThread bankThread = new BankThread(person);

        atmThread.start();
        bankThread.start();

    }
}
