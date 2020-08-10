package com.company;

public class Cy_27 extends ControlAirPlane{
    ControlAirPlane controlAirPlane =  new ControlAirPlane();

    public void generatorDistanceUp(){

        int a = (int) (Math.random()*15);
        System.out.print("Відстань літака " + a + " метрів");
        controlAirPlane.movingup();
    }
    public void generatorDistanceDown(){
        int a = (int) (Math.random()*15);
        System.out.print("Відстань літака " + a + " метрів");
        controlAirPlane.movingdown();
    }
    public void generatorDistanceLeft(){
        int a = (int) (Math.random()*15);
        System.out.print("Відстань літака " + a + " метрів");
        controlAirPlane.movingleft();
    }
    public void generatorDistanceRight(){
        int a = (int) (Math.random()*15);
        System.out.print("Відстань літака " + a + " метрів");
        controlAirPlane.movingright();
    }
}
