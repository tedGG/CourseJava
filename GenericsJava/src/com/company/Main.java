package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Select the operation which you want to do");
        System.out.println("1.Add new object to map");
        System.out.println("2.Delete object from map by key");
        System.out.println("3.Delete object from map by value");
        System.out.println("4.Display key set");
        System.out.println("5.Display list values");
        System.out.println("6.Display map");
        showMenu();
    }
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        Map<Integer, String> map = new Map<>();
        switch (value){
            case 1:{
                System.out.println("Enter key");
                int k = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter value");
                String v = scanner.nextLine();
                map.add(k,v);
                break;
            }
            case 2:{
                int input  = scanner.nextInt();
                map.remove(input);
                break;
            }
            case 3:{
                String inputvalue = scanner.nextLine();
                map.removeValue(inputvalue);
                break;
            }
            case 4:{
                map.showKey();
                break;

            }
            case 5:{
                map.showValue();
                break;
            }
            case 6:{
                map.showList();
                break;
            }
        }
    }
}
