package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x =scanner.nextInt();
        if (x % 1 == 0) {
            System.out.println("Число ціле");
        }
    }
}
