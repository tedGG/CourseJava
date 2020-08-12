package com.company;

public class Main {

    private static Object Robot;
    private static Object CoffeRobot;
    private static Object RobotDancer;
    private static Object RobotCooker;

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
