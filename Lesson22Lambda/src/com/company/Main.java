package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
    }

    public static void Task1(){
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        List<Pet> pets = Arrays.asList(cat,dog,cow);
        pets.forEach(Pet::voice);
    }
    public static void Task2() {
        int rand= (int) (Math.random()*2);
        Predicate<Integer> predicate = (x)->x == 0;
        if(predicate.test(rand)){
           System.out.println("Орел");
        }else System.out.println("Решка");
    }
    public static void Task3() {
        Supplier<Float> floatConsumer = () ->
            (float) Float.MAX_EXPONENT;
            Supplier<Double> doubleCounsumer = () -> (double) Double.MAX_EXPONENT;
            System.out.println("Float max: " + floatConsumer.get() + " " + "Double max: " + doubleCounsumer.get());


        }
        public static void Task4 () {

         ConstructorGet getConstr = Counter::new;
         Counter counter =getConstr.get(2,2,4);
         System.out.println(counter);


        }
        public static void Task5 () {

            Amphibia frog = new Frog();

            Consumer<Amphibia> consumerFrog = (x) -> {
                x.eat();
                x.swim();
                x.sleep();
                x.walk();
            };
            consumerFrog.accept(frog);
        }

    }

