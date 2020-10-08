package com.company;

public class Car {
    int horsepower;
    int year;
    Helm helm;
    Engine engine;

    public Car(int horsepower, int year, int diametr,String material,int numberofcelinders) {
        this.horsepower = horsepower;
        this.year = year;
        this.engine = new Engine(numberofcelinders);
        this.helm = new Helm(diametr, material);
    }
    @Override
    public String toString() {
        return
                "Кінські сили:" + horsepower +
                        ", Рік випуску: " + year;
    }
}