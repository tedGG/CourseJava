package com.company;

public  class ControlAirPlane extends AirPlane{


    public ControlAirPlane(int weight, int lenght, int width) {
        super(weight, lenght, width);
    }

    public void movingup(){
        System.out.println(" літак летить вверх");
    }
    public void movingdown(){
        System.out.println(", літак летить вниз");
    }
    public void movingright(){
        System.out.println(" літак летить в право");
    }
    public void movingleft(){
        System.out.println(" ,літак летить в ліво");
    }


    @Override
    public void StartEngine() {
        int a = (int) (Math.random()*24);
        System.out.println("Часу до взліту літака: "+a + " секунд");
    }


    @Override
    public void RiseThePlane() {
        double killometrs = Math.random()*1000;

        System.out.printf("На повному баку палива літак пролетить кілометрів: %.2f \n", killometrs);
    }

    @Override
    public void LandingThePlane() {
        System.out.println("Літак іде на посадку!");
    }
}
