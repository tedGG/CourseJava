package com.company;

public class Cy_27 extends ControlAirPlane implements TurboSpeed,TechnologyStels,NuclearStrike {
    ControlAirPlane controlAirPlane =  new ControlAirPlane(25,15,400);
    int maxSpeedAirPlane;
    String color;

    public Cy_27() {
        super(20,40,50);
        this.maxSpeedAirPlane = 902;
        this.color = "white";
    }



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
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    @Override
    public void NuclearStriker() {
        System.out.println("Ядерних боєголовок буде скинуто - "+rnd(0,10));
    }

    @Override
    public void TechnologyStelsy() {
        int a = (int) (Math.random()*220);
        System.out.println("Літака не помітно на відстані - " + a + " метрів");
    }

    @Override
    public void TurboSpeedAirPlane() {

        int random = rnd(902,1000);
        System.out.println("Максимальна швидкість літака - "+ maxSpeedAirPlane +", км/год " +"швидкість при турбо прискоренні - "+ random+"км/год");

    }


}
