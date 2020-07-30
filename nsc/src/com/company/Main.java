package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Nsc();

    }
    public static void Nsc(){
        Scanner scann = new Scanner(System.in);

        System.out.print("Enter number1:");
        int number1 = scann.nextInt();
        System.out.print("Enter number2:");
        int number2 = scann.nextInt();

        if (number1 < number2) {
            int number = number1;
            number1 = number2;
            number2 = number;
        }
        int res;

        int multiplication = number1 * number2;

        do {
            res = number1 % number2;
            number1 = number2;
            number2 = res;
        } while (res != 0);
        int nok = multiplication / number1;
        System.out.print("Result:" + nok);
    }

    }

