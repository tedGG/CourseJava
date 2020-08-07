package com.company;

public class Animal {
    private String nameAnimal;
    private int SpeedAnimal;
    private int AgeAnimal;

    Animal(String nameAnimal,int speedAnimal,int ageAnimal){
        this.nameAnimal = nameAnimal;
        this.SpeedAnimal = speedAnimal;
        this.AgeAnimal = ageAnimal;

    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public void setSpeedAnimal(int speedAnimal) {
        SpeedAnimal = speedAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        AgeAnimal = ageAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public int getSpeedAnimal() {
        return SpeedAnimal;
    }

    public int getAgeAnimal() {
        return AgeAnimal;
    }

    @Override
    public String toString(){
        return "Назва тварини = " + getNameAnimal()+ "Швидкість тварини = " +
                getSpeedAnimal() + " км/год " + "Вік тварини = " + getAgeAnimal()+ " років";
    }
}
