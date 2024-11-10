package exceptionhandling;

import java.util.Scanner;

public class ThrowExceptionMain {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        String snum = sc.next();

        try {
            if (checkIfAgeIsValidNumber(snum) == false) {
                throw new Exception("Age is Not Valid");
            }
        }
        catch (Exception ex){
            System.out.println("Inside the catch block");
        }


        System.out.println("program executed");


            show(); // default catch





    }

    public static boolean checkIfAgeIsValidNumber(String s){
        boolean isCorrect = false;

        try {
            int num = Integer.parseInt(s);
            if (num<0){
                isCorrect = false;
            }else {
                isCorrect = true;
            }
        }
        catch (Exception ex){
            isCorrect = false;
        }

        return isCorrect;
    }


    public static void show() throws Exception{
        throw new Exception("Generic Exception");
    }

    public void ArithmeticShow(){
        throw new ArithmeticException("Arithmetic Exception");
    }
}
