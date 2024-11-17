package Threading;

public class MyThread extends Thread{

    @Override
    public void run(){
        try {
            Thread.currentThread(). join();
        }
        catch (Exception ex){

        }
       for (int i=1;i<=10;i++){
           System.out.println(i+" "+Thread.currentThread().getName());
       }
    }
}
