package com.company;

public class Kuzov {
    String type;

    Kuzov(String type){
    this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
        System.out.println("Тип кузова - "+type);
    }
}
