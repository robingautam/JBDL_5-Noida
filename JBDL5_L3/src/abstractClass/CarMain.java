package abstractClass;

public class CarMain {

    public static void main(String[] args) {
        Car c = new Honda();
        c.startEngine();
    }


}

abstract class Car {


    public abstract void startEngine();
}

class BMW extends Car {

    @Override
    public void startEngine() {
        System.out.println("BMW is going to start");
    }
}

class Honda extends Car {

    @Override
    public void startEngine() {
        System.out.println("Honda is going to start");
    }
}
