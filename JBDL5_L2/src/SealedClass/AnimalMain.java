package SealedClass;

public class AnimalMain {


}
sealed class Animal permits Dog{
    void makeSound(){
        System.out.println("Inside animal class");
    }
}

non-sealed class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Inside the DOG Class");
    }
}
class Human extends Dog {

}

