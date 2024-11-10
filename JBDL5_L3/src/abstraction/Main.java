package abstraction;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        Car c = new BMW();

        p.startCar(c);
    }
}
