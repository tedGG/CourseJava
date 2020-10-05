package com.company;

import java.util.*;

public class ZooClub {
    String name;
    String typeanimal;
    String nameanimal;
    int age;


    Map<Person,Animal> map =  new HashMap<>();

    public void addMember(){

        System.out.println("Щоб додати учасника клубу введіть наступні дані: ");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введіть ім'я учасника: ");
        name = scanner.nextLine();
        System.out.println("Введіть вік: ");
        age = scanner.nextInt();



        map.put(new Person(name,age),new Animal(typeanimal,nameanimal));
        System.out.println(map);
    }
    public void addAnimaltoMember(){

        System.out.println("Щоб додати тваринку до учасника клубу: ");
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введіть ім'я учасника: ");
        name = scanner.nextLine();
        System.out.println("Введіть вік: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введіть тип тварини: ");
        typeanimal = scanner.nextLine();
        System.out.println("Введіть ім'я тварини: ");
        nameanimal =scanner.nextLine();



        Person person = new Person(name,age);
        Animal animal =  new Animal(typeanimal,nameanimal);

        map.put(person,animal);
        System.out.println(map);
    }
    public void DeleteAnimal() {


        addAnimaltoMember();
        map.remove(new Animal(typeanimal, nameanimal));
        System.out.println("Видалено тваринку");


        for(Animal a :)

    }
    public void DeleteMember(){
        addAnimaltoMember();
        map.clear();
        System.out.println("Видалено учасника клубу "+map);
    }
    public void RemoveaSpecificAnimal(){

    }
    public void showZooclub(){

    }


}
