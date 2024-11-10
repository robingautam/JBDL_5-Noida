package exceptionhandling;

import java.util.Scanner;

public class CustomMain {

    public static void main(String[] args) throws AgeNotValidException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();

        if (age<18){
            throw new AgeNotValidException("Age is smaller than 18");
        }

        System.out.println("Voted");
    }
}
