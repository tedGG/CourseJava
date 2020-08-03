package com.company;

public class Car {
    String marka;
    Kermo kermo = new Kermo(12);
    Koleso koleso = new Koleso(21);
    Kuzov kuzov = new Kuzov("Седан");

    Car(String  marka){
        this.marka = marka;
        System.out.println("Марка - "+marka);

    }
}
