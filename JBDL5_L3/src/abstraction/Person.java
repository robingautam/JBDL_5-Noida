package abstraction;

public class Person {

    String name;
    Car car;

    public void startCar(Car car){
        car.startEngine();
    }
}
