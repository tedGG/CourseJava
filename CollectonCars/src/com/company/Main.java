package com.company;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        randomArray();

    }
    public static void randomArray(){
        int k,n;
        k = (int) (2 + Math.random() * 4);
        n = (int) (2 + Math.random() * 4);
        Car[][] car = new Car[k][n];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                car[i][j] = new Car(rndhorsepower(),rndyear(),rnddiametr(),rndmaterial(),rndnumberofcelinders());
            }
        }
        System.out.println("Before change: \n" + Arrays.deepToString(car));
    }
    public static int rndhorsepower(){

        int randpower = (int) (2 + Math.random() * 10);
        return randpower;

    }
    public static int rndyear(){
        int rndyear = (int) (2000 + Math.random() * 2020);
        return rndyear;
    }
    public static int rnddiametr(){
        int rnddiametr = (int) (2 + Math.random() * 10);
        return rnddiametr;
    }
    public static String rndmaterial(){
        int rnd = (int) (Math.random() * 2);

        if (rnd == 0)
            return "Алькантара";

        return "Штучна машинна шкіра";
    }
    public static int rndnumberofcelinders(){
        int randomcelinders = (int) (Math.random() * 16);
        return randomcelinders;
    }
}
