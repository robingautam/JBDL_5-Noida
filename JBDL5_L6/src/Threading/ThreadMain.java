package Threading;

public class ThreadMain {

    public static void main(String[] args) {

      //  System.out.println(Thread.currentThread().getName());

     /*   MyThread thread = new MyThread();
        MyThread thread1 = new MyThread();
        thread.start();
        thread1.start();*/


        MyThread thread3 = new MyThread();
        thread3.start();
           try {
            thread3.join();
        }
        catch (Exception ex){

        }

        for (int i=0;i<=10;i++){
            System.out.println(i+": "+Thread.currentThread().getName());
        }
    }
}
