package ProdConsProblem;

public class Producer extends Thread {

    SharedData sharedData;

    Producer(SharedData sharedData){
        this.sharedData = sharedData;
    }

    @Override
    public void run(){
        for (int i=1;i<=10;i++){
            sharedData.produce(i);
        }
    }
}
