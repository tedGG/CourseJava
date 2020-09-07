package com.company;

public class Helm {
    int diameter;
    String material;


    public Helm(int diameter, String material) {
        this.diameter = diameter;
        this.material = material;
    }

    @Override
    public String toString() {
        return
                "діаметр: " + diameter +
                ", матеріал:'" + material;
    }
}
