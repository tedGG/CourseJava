package com.company;

public abstract class AirPlane {
    int weight;//waga
    int lenght;
    int width;



    public AirPlane(int weight, int lenght, int width) {
        this.weight = weight;
        this.lenght = lenght;
        this.width = width;
    }
    public abstract void StartEngine();

    public abstract void RiseThePlane();
    public abstract void LandingThePlane();



}
