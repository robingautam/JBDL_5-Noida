package interfaces;

public interface MyInter {

    void doSomeWork();

    default void someWork(){
        System.out.println("some work");
    }

    static void staticMethod(){
        System.out.println("This is static method");
    }

    private int sum(int a, int b){
       return a+b;
    }




}
