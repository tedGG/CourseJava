package com.company;

public class Handlebar {
    int DWheel;
    String material;

    public void setDWheel(int DWheel) {
        this.DWheel = DWheel;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    @Override
    public String toString() {
        return "Діаметр колеса: " + DWheel +
                ", Матеріал: " + material + '\'';
    }
    static String getRndMaterial() {
        return (Math.random() < 1 ? "Шкіра" : "алькантара");
    }
}
