package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Dog",20,6);
        animal.setNameAnimal("Cat ");
        animal.setAgeAnimal(7);
        animal.setSpeedAnimal(15);

        System.out.println("Назва тварини = " + animal.getNameAnimal()+ "Швидкість тварини = " +
                animal.getSpeedAnimal() + " км/год " + "Вік тварини = "+animal.getAgeAnimal());

    }
}
