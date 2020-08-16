package com.company;

public class Main {

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.Add(5,1));
        System.out.println(methods.multiplication(0,15));
        System.out.println(methods.Subtract(5,0));
        try {
            methods.Divide(0,0);
            methods.devideandadd(4,14,15);
        } catch (MyException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
