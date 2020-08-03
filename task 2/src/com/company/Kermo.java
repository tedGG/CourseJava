package com.company;

public class Kermo {
    private int size;

    Kermo(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        System.out.println("Розмір керма - "+size);
    }

    public void SizePlus(){

            System.out.println(size+=size);

    }
}
