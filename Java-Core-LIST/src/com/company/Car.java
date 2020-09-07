package com.company;

public class Car {
    int horsePower;
    int year;

    Engine engine = new Engine();
    Handlebar helm = new Handlebar();

    Car(int horsePower, int year, int number, double diametr, String material) {
        this.horsePower = horsePower;
        this.year = year;
        engine.setNumberofcelinders(number);
        helm.setDWheel((int) diametr);
        helm.setMaterial(material);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public Handlebar getHelm() {
        return helm;
    }

    @Override
    public String toString() {
        return "Кількість кінських сил: " + horsePower +
                ", Рік випуску: " + year +
                ", Мотор " + engine +
                ", Кермо: " + helm;
    }

    static int getRndNumber(int x1, int x2)
    {
        return (int)(Math.random() * (x2 - x1) + x1);
    }
}
