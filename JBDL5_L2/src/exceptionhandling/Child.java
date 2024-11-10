package exceptionhandling;

public class Child extends Parent{

    @Override
    public void show() throws ArithmeticException{
        System.out.println("inside the child class");
    }
}
