package com.company;


import java.util.*;

public class Main {


    public static void main(String[] args) {

        System.out.println("select the method which you want to realize");
        System.out.println("1. add commodity");
        System.out.println("2. delete commodity");
        System.out.println("3. replace commodity");
        System.out.println("4. sort by namecommodity");
        System.out.println("5. sort by lenght");
        System.out.println("6. sort by width");
        System.out.println("7. sort by weight");
        System.out.println("8. show i element");
        System.out.println("9. EXIT");
        Menu();

    }

    public static void Menu(){
        Scanner scan =  new Scanner(System.in);
        int menuNumber =scan.nextInt();
        switch (menuNumber){
            case 1:{
                Comodity.addComodity();
                break;
            }
            case 2:{
                Comodity.DeleteComodity();
                break;
            }
            case 3:{
                Comodity.ReplaceComodity();
                break;
            }
            case 4:{
                Comodity.SortName();
                break;
            }
            case 5:{
                Comodity.SortLenght();
                break;
            }
            case 6:{
                Comodity.SortWidth();
                break;
            }
            case 7:{
                Comodity.SortWeight();
                break;
            }
            case 8:{
                Comodity.ShowiElement();
                break;
            }
            case 9:{
                System.exit(0);
                break;
            }

        }
    }




}
