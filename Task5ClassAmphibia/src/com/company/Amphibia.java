package com.company;

public class Amphibia {
    String eat;
    String sleep;
    String swim;
    String walk;


    public Amphibia(String eat, String sleep, String swim, String walk) {
        this.eat = eat;
        this.sleep = sleep;
        this.swim = swim;
        this.walk = walk;
    }

    public void eat(){
        System.out.println("Поїла");
    }
    public String toString()
    {
        return this.eat + this.sleep + this.swim + this.walk;
    }
}
