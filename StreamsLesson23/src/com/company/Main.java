package com.company;

import java.util.Scanner;

public class Main {
    static  Person person;
    static Animal animal;
    public static void main(String[] args) {
        System.out.println("Select the operation what you want to do:");
        System.out.println("1.Add member to club");
        System.out.println("2.Add animal to club");
        System.out.println("3.Remove animal from member club");
        System.out.println("4.Remove member club");
        System.out.println("5.Remove specific animal from member club");
        System.out.println("6.Show zooclub");
        Menu();
    }
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        ZooClub zooClub = new ZooClub();
        switch (value) {
            case 1: {
                System.out.println("Enter name and age: ");
                zooClub.addMember();
                break;
            }
            case 2:
                scanner.nextLine();
                System.out.println("Enter name member:");
                String name = scanner.nextLine();
                System.out.println("Enter age member:");
                int age = scanner.nextInt();
                person = new Person(name, age);
                scanner.nextLine();
                System.out.println("Enter type animal:");
                String type = scanner.nextLine();
                System.out.println("Enter name animal:");
                String nameAnimal = scanner.nextLine();
                animal = new Animal(type, nameAnimal);
                zooClub.addAnimaltoMember(person, animal);
                break;
            case 3: {
                    zooClub.removeAnimalFromClub(person,animal);
                break;
            }
            case 4: {
                zooClub.removeMemberFromClub(person,animal);
                break;
            }
            case 5:
                zooClub.removeSpecificAnimalFromClub(person,animal);
                break;
            case 6:
                zooClub.showZooClub();
                break;
        }
    }
}
