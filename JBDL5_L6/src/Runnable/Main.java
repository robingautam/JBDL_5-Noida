package Runnable;

public class Main {

    public static void main(String[] args) {
        RunnThread runnThread = new RunnThread();
        Thread thread = new Thread(runnThread);
        thread.start();
    }
}
