package org.example.constructorInj;

public class Math {

    int a;
    int b;

    public Math(double a, double b){
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("double double");
    }
    public Math(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("int int ");
    }

    public Math(String a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("String String ");
    }




}
