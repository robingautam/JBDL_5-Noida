package exceptionhandling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //int c = 10/0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        String snum = sc.next();

        try {
            int[] arr = {1,2,3};
            int ind = Integer.parseInt(snum);
            int b = arr[ind];
            //  nested try catch
            try {

            }
            catch (Exception ex){

            }
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Arithmetic");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("ArrrayIndex");
        }
        catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println("Number Format");
        }
        finally {
            System.out.println("inside the finally block");
        }

        // custom throw




        System.out.println("Program executed");
    }
}
