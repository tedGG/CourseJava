package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;


        System.out.println("Введіть числа");

        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();

        }
        if (scanner.hasNextInt()) {
            number2 = scanner.nextInt();

            System.out.println("Сума - " + (int) (number1 + number2));
        }

        else {
            scanner.next();
            System.out.println("Введіть ціле число");
        }
    }
}
