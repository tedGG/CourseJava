package com.company;

import javafx.scene.paint.Color;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int coinSide1 = 0;
        int coinSide2= 1;
        System.out.println("Кидаємо монетку...");
        Random random = new Random();
        int[] coins = {coinSide1,coinSide2};

        int rand =  random.nextInt(coins.length);


        if(rand ==1){
            
            System.out.println("Орел");
        }else System.out.println("Решка");

    }
}
