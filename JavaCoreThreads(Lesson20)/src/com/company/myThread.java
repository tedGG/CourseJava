package com.company;

import java.util.Scanner;

public class myThread extends Thread{
    @Override
    public void run() {
        System.out.println("Потік Thread");

        int count;
        Scanner scanner = new Scanner(System.in);
        count =scanner.nextInt();

        int[] f = new int[count];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < count; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i < count; ++i) {
            System.out.println(f[i]);
        }


    }
}
