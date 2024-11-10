package FI;


public interface Task {

      void someTask();
      default void someTask3(){
          System.out.println("dafaf");
      }
}
