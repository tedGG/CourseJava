package com.company;

import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        double i = 0.0123456;
        float k = 3;
        Formatter frm = new Formatter();
        System.out.println(frm.format("%3.2e", i));
        System.out.println(Math.max(i,k));
        System.out.println(Math.min(i,k));




    }
}
