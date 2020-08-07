package com.company;

public class Main {


    public static void main(String[] args) {
        Robot robot = new Robot();

        CoffeRobot  coffeRobot = new CoffeRobot();

        RobotDancer robotDancer = new RobotDancer();

        RobotCooker robotCooker = new RobotCooker();
       

        
       Robot [] robots = {robot,coffeRobot,robotDancer,robotCooker};
       for(int i =0;i < robots.length;i++){
           robots[i].work();
       }







    }
}
