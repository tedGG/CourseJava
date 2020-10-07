package com.company;

import java.lang.reflect.*;

public class Main {
    static Car car = new Car(652,"Blue");
    static Class clss = car.getClass();


    public static void main(String[] args) throws IllegalAccessException {
    PlanMin();
    PlanMax();
    }
    public static void PlanMin() throws IllegalAccessException {

        System.out.println("Constructors: ");
        Constructor[] constructors = clss.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters){
                System.out.println(parameter.getType().getName());
            }

            System.out.println(Modifier.toString(constructor.getModifiers()));
        }
        System.out.println("Methods: ");
        Method[] methods = clss.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){

                System.out.println(parameter.getType().getName());
            }
            System.out.println(Modifier.toString(method.getModifiers()));
        }
        System.out.println("Fields: ");
        Field[] fields = clss.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.getName());
        }


    }
    public static void PlanMax() throws IllegalAccessException {
        System.out.println("Fields: ");
        Field[] fields = clss.getDeclaredFields();
        for (Field field:fields){
        field.setAccessible(true);
        System.out.println(field.getInt(car));
        field.setInt(car,650);
        System.out.println(field.getInt(car));
    }
}
}
