package com.company;

public class Main {

    public static void main(String[] args) {
        byte b = 1;
        byte k = 1;
            while (k>0){
                for(int i = 0;i<k;i++){
                    k++;
                }
                System.out.println("Мінімальне значення байту - " + k);
            }

            while (b>0) {
                for (int i = 0; i < b; b++) {
                    b++;

                }
                System.out.println("Максимальне значення байту - " + Math.abs(b));
            }
            Integer integer = 1;



            while (integer>0){
                for (int i = 0; i<integer;integer++){
                    integer++;
                }
                System.out.println("Максимальне значення Integer - " + Math.abs(integer));

            }
            while (integer>0){
                for(int i =1; i<integer;i--){
                    integer--;
                }
                System.out.println(integer);

            }
        System.out.println("Мінімальне значення Integer - "+integer);


            System.out.println("Мінімальне значення Float - "+Float.MIN_VALUE);
            System.out.println("Мінімальне значення Float - "+Float.MAX_VALUE);
            System.out.println("Мінімальне значення Double - "+Double.MIN_VALUE);
            System.out.println("Мінімальне значення Double - "+Double.MAX_VALUE);


    }
}