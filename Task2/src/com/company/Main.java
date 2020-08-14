package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;



        boolean isValid = false;

        while(!isValid) {
            System.out.println("Введіть число");
            if (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    num = scanner.nextInt();
                    isValid = true;

                } else {
                    scanner.next();
                    System.out.println("Введіть ціле число");
                }

                if (num % 2 == 0)
                    System.out.println("Число парне");
                else
                    System.out.println("Число не парне");

            }
        }}
    }
}
