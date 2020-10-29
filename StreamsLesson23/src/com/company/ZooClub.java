package com.company;

import java.util.*;

public class ZooClub {

    Map<Person, List<Animal>> map = new HashMap<>();

    public void addMember(){

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        Person person = new Person(name,age);
        map.put(person,new ArrayList<>());
        System.out.println(map);
        
    }
    public void addAnimaltoMember(Person person,Animal animal){
        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        map.putIfAbsent(person,animalList);
        System.out.println(map);
    }
    public void removeAnimalFromClub(Person person,Animal animal) {
        addAnimaltoMember(person, animal);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.stream()
                .filter(producer -> producer.getType().equals("Cat"))
                .findFirst()
                .map(p -> {
                    animalList.remove(p);
                    return p;
                });
        System.out.println(animalList);


    }
    public void removeMemberFromClub(Person person, Animal animal){
        addAnimaltoMember(person,animal);
        if(!map.isEmpty()){
            map.remove(person);
        }
        System.out.println(map);


    }
    public void removeSpecificAnimalFromClub(Person person,Animal animal){
        System.out.println("Enter name of animal which you want to delete: ");
        Scanner scanner = new Scanner(System.in);
        String deleteAnimal = scanner.nextLine();
        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);
        animalList.stream()
                .filter(producer -> producer.getType().equalsIgnoreCase(deleteAnimal))
                .findFirst()
                .map(p -> {
                    animalList.remove(p);
                    return p;
                });
        System.out.println(animalList);
    }
    public void showZooClub(){
        System.out.println(map);
    }

}
