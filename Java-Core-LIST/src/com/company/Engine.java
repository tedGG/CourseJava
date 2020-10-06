package com.company;

public class Engine {
    int numberofcelinders;

    public void setNumberofcelinders(int numberofcelinders) {
        this.numberofcelinders = numberofcelinders;
    }



    @Override
    public String toString() {
        return "Кількість циліндрів: " + numberofcelinders;
    }
}
