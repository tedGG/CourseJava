package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("1 Завдання "+ "2 Завдання"+"3 Завдання "+ "4 Завдання " +"5 Завдання "+ "6 Завдання"+"7 Завдання "+ "8 Завдання"+ "9 Завдання "+ "10 Завдання");
        int menuValue = scan.nextInt();


        String month;
        scan.nextLine();
        month = scan.nextLine();


        monthCheck(menuValue, month);


    }

    public static void monthCheck(int menuValue, String month) {
        boolean checkMonth = false;
        int day = 0;
        int seasonValue = 0;


        switch (menuValue) {
            case 1:
                System.out.print("\nВведіть місяць:");
                for (Month m : Month.values()) {
                    if ((month.equalsIgnoreCase(m.toString()))) {
                        checkMonth = true;
                        System.out.println(checkMonth);
                        break;

                    }

                }

                if (checkMonth==true) {
                    System.out.println("Місяць: " + month.toUpperCase() + " Такий місяць існує");
                } else
                    System.out.println("Місяць: " + month.toUpperCase() + " Такого місяця не існує");

                break;

            case 2:
                System.out.print("\nВведіть місяць:");
                Seasons season = null;
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        season = m.getSeason();
                        break;
                    }
                }

                System.out.println("Пора року -  " + season + " Місяці:");
                for (Month m : Month.values()) {
                    if ((m.getSeason()).equals(season)) {
                        System.out.println(m.toString());
                    }
                }
                break;

            case 3:
                System.out.print("\nВведіть місяць:");
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day = m.getDay();
                        break;
                    }
                }


                System.out.println("Місяці які мають 31 день в місяці " + day);
                for (Month m : Month.values()) {
                    if (m.getDay() == day) {
                        System.out.println(m.toString());
                    }
                }
                break;

            case 4:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day = m.getDay();
                        break;
                    }
                }

                System.out.println("Місяці, які мають меншу кількість днів" + day );
                for (Month m : Month.values()) {
                    if (m.getDay() < day) {
                        System.out.println(m.toString());
                    }
                }
                break;

            case 5:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day = m.getDay();
                        break;
                    }
                }

                System.out.println("Місяці, які мають меншу кількість днів " + day);
                for (Month m : Month.values()) {
                    if (m.getDay() > day) {
                        System.out.println(m.toString());
                    }
                }
                break;

            case 6:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        seasonValue = m.season.ordinal();

                        Seasons[] seasons = Seasons.values();
                        if (m.season.ordinal() == 3) {
                            System.out.println(Seasons.WINTER);
                        } else
                            System.out.println(seasons[seasonValue + 1]);

                    }
                }
                break;
            case 7:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        seasonValue = m.season.ordinal();

                        Seasons[] seasons = Seasons.values();
                        if (m.season.ordinal() == 0) {
                            System.out.println(Seasons.AUTUMN);
                        } else
                            System.out.println(seasons[seasonValue - 1]);

                    }
                }
                break;

            case 8:
                System.out.println("місяці які мають парну кількість днів\n ");
                for (Month m : Month.values()) {
                    if (m.getDay() % 2 == 0) {
                        System.out.println(m.toString());
                    }
                }

            case 9:
                System.out.println("місяці які мають непарну кількість днів\n: ");
                for (Month m : Month.values()) {
                    if (m.getDay() % 2 != 0) {
                        System.out.println(m.toString());
                    }
                }

            case 10:
                for (Month m : Month.values()) {
                    if (month.equalsIgnoreCase(m.toString())) {
                        day = m.getDay();
                        break;
                    }
                }
                if (day % 2 == 0) {
                    System.out.println("Місяць " + month.toUpperCase() + " має парну кількість днів");
                } else
                    System.out.println("Місяць " + month.toUpperCase() + " має не парну кількість днів");


        }
    }

}


