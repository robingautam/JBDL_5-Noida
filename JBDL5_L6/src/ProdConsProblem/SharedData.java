package ProdConsProblem;

public class SharedData {

    int data;
    public boolean isProduced = false;

    public synchronized void produce(int n)  {
        try {
            if (isProduced == true) {
                wait();
            }
            this.data = n;
            isProduced = true;
            System.out.println("Produced: " + this.data);
            notifyAll();
        }
        catch (Exception exception){

        }
    }

    public synchronized void consume() {
        try {
            if (isProduced == false) {
                wait();
            }
            System.out.println("Consumed: " + this.data);
            isProduced = false;
            notifyAll();
        }
        catch (Exception exception){

        }
    }
}
