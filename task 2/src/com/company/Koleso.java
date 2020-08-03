package com.company;

public class Koleso {
    private int sizeKolesa;

    Koleso(int sizeKolesa){
        this.sizeKolesa = sizeKolesa;
        System.out.println("Радіус колеса - "+sizeKolesa);
    }

    public int getSizeKolesa() {
        return sizeKolesa;
    }

    public void setSizeKolesa(int sizeKolesa) {
        this.sizeKolesa = sizeKolesa;
    }
    public void sizeKolesa(){
        System.out.println("Радіус колеса - " + sizeKolesa);

    }
}
