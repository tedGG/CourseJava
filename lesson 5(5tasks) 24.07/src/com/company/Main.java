package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Second();
        //First();
        //Third();
        //Fourth();
        elmas();
    }
    public static void First(){
        int k = 55;

        for(int i = 1;i<55;i++){
            System.out.println(i);
            i++;
        }
    }
    public static void Second(){
        int n = -50;

        for(int i = 90;i > n;i--){
            if(i>=0){
            System.out.println(i);

        }
        }

    }
    public static void Third(){
        Scanner scan = new Scanner(System.in);
        int sc = scan.nextInt();

        int n = sc;
        if(n % 2 == 0) {
            System.out.println("Число " + n + " парне");
        } else {
            System.out.println("Число " + n + " непарне");
        }


    }
    public static void Fourth(){
        /*System.out.println("Введіть два числа: ");
        Scanner scan =  new Scanner(System.in);
        Double n = scan.nextDouble();
        Double m = scan.nextDouble();*/

        double n=15.45;
        double m=16.55;


        int a=10;
        double b=  a-n;//-5,45
        double c = a-m;//1,45

        if(b == c){
            System.out.println("Числа рівні");
        }  if(b<c){
            System.out.println("Число "+m+" ближе до "+a);
        }
        if (b>c) {
            System.out.println("Число "+n+" ближе до "+a);
        }








}
    public static void elmas()  {
        int a[] = new int[]{1, 4, -1, 2, 5, 10, 7, 8, 9, -10 };
        int max=0;
        int min =0;
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
        for(int i=0; i<a.length; i++)
            if(a[i]>max){
                max=a[i];
            }
            else{
                if(a[i]<min){
                    min=a[i];
                }
            }
        System.out.println("Масимальний елемент масиву -"+max);
        System.out.println("Мінімальний елемент масиву -"+min);

    }
    }

