package com.company;


import java.awt.*;
import java.util.Scanner;

public class Main {
    static ZooClub zooClub =  new ZooClub();
    public static void main(String[] args) {


        System.out.println("Виберіть метод який ви хочете виконати: ");
        System.out.println("1.Додати учасника клубу");
        System.out.println("2.Додати тваринку до учасника клубу");
        System.out.println("3.Видалити тваринку з учасника клубу");
        System.out.println("4.Видалити учасника клубу");
        System.out.println("5.Видалити конкретну тваринку зі всіх власників");
        System.out.println("6.Вивести на екран зооклуб");
        System.out.println("7.Вийти з програми");
        Menu();

    }
    public static void Menu(){
        Scanner scanner =  new Scanner(System.in);
        int value;
        value = scanner.nextInt();
        switch (value){
            case 1:{
                zooClub.addMember();
                break;
            }
            case 2:{
                zooClub.addAnimaltoMember();
                break;
            }
            case 3:{
                zooClub.DeleteAnimal();
                break;
            }
            case 4:{
                zooClub.DeleteMember();
            }
            case 5:{

            }
            case 6:{

            }
        }
    }
}
