package com.company;

public class Car {
   private int horsepower;
    String color;

    public Car(int horsepower, String color) {
        this.horsepower = horsepower;
        this.color = color;

    }
    public String someMethod(String s){
        System.out.println(s);
        return s;
    }
}
