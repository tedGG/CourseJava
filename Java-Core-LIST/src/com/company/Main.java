package com.company;


import java.util.*;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;


public class Main {

    public static void useList(ArrayList<Car> car, Car[] cars){
        Objects.requireNonNull(car);
        Objects.requireNonNull(cars);
        car.addAll(asList(cars));
    }


    public static void main(String[] args) {

        int n = (int) (Math.random() * 25);
        int m = (int) (Math.random() * 25);



        ArrayList<Car> cars = new ArrayList<>();
        useList(cars,new Car[]{});


        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                cars.add(car);

            }
        }*/


        while (true) {
            System.out.println("1.Вивести всі обєкти в консоль \n" + "2.Засетати одне значення для поля");
            System.out.print("Оберіть функцію, яку ви хочете виконати:");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println(Arrays.deepToString(new ArrayList[]{cars}));
                    break;
                case 2:
                    /*for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            cars.get(i)[j]=j;

                        }
                    }
                    System.out.println(Arrays.deepToString(cars));*/
                    break;
                default:
                    System.out.println("Неправильно введено номер,введіть ще раз\n");


            }


        }

    }




    public static void ArrSort(){

        Integer[] numbers = new Integer[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = (int)(Math.random() * 45);
            System.out.print(numbers[i]+ " ");

        }
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("\n"+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


    }
    public static int randomHorsePower() {
        int horsePower = (int) (85 + Math.random() * 915);

        return horsePower;
    }

    public static int randomReleaseDate() {
        int releaseDate = (int) (2000 + Math.random() * 20);

        return releaseDate;
    }

    public static void randomCylinderNumber() {
        int cylinderNumber = (int) (2 + Math.random() * 6);
        System.out.println(cylinderNumber);
    }

    public static int randomHadnlebarDiametr() {
        int hadnlebarDiametr = (int) (Math.random() * 12 + 5);
        return hadnlebarDiametr;
    }

    public static String randomMaterial() {
        int random = (int) (Math.random() * 2);

        if (random == 0)
            return "Шкіра";

        return "Алькантара";

    }


}
