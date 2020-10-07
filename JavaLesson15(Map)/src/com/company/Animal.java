package com.company;

public class Animal {
    String TypeAnimal;
    String nameAnimal;

    public Animal(String typeAnimal, String nameAnimal) {
        TypeAnimal = typeAnimal;
        this.nameAnimal = nameAnimal;
    }

    @Override
    public String toString() {
        return "Тип тварини: " + TypeAnimal + ", " + "Ім'я тварини: " +nameAnimal;
    }

    public String getTypeAnimal() {
        return TypeAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }
}
