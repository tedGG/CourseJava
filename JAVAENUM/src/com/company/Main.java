package com.company;


import java.lang.invoke.WrongMethodTypeException;
import java.nio.file.Paths;
import java.rmi.MarshalledObject;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Виберіть,яку операцію ви хочете виконати");
        System.out.println("1,2,3,4,5,6,7,8,9,10");
        int numberCase;
        numberCase = scanner.nextInt();

        if(numberCase<11){
            try {
                throw new WrongInputConsoleParametersException("you are");
            } catch (WrongInputConsoleParametersException wrongInputConsoleParametersException) {
                wrongInputConsoleParametersException.printStackTrace();
            }
        }


        try {
            MonthMethods(numberCase);
        } catch (WrongInputConsoleParametersException w) {
            w.printStackTrace();
        }

    }

    public static void MonthMethods(int numberCase) throws WrongInputConsoleParametersException {
        Month[] months = Month.values();
        System.out.println("Введіть місяць або день");
        Scanner scanner = new Scanner(System.in);
        String monthget;
        monthget = scanner.nextLine();



        switch (numberCase) {
            //Перевірити чи є такий місяць
            case 1:
                    Month month1 = Month.valueOf(monthget);
                    if (month1 != null) {
                        System.out.println("Місяць " + monthget + " існує");
                    }else
                        throw new WrongInputConsoleParametersException("data is incorect");




            break;
        //Вивести всі місяці з такою ж порою року
            case 2:

                Seasons seasons = null;
                for (Month month : Month.values()) {
                    if (month.equalsIgnoreCase(monthget)) {
                        seasons = month.getSeason();
                        break;
                    }

                }
                System.out.println("Місяці, з однаковою порою року");
                for (Month month : Month.values()) {
                    if (month.getSeason().equals(seasons)) {
                        System.out.println(month.name());
                    }
                }
                break;


            //Вивести всі місяці які мають таку саму кількість днів
            case 3:
                int countDays;
                countDays = scanner.nextInt();
                System.out.println("Місяці, які мають однакову кількість днів:");
                for (Month month : Month.values()) {
                    if ((month.getDay()) == countDays) {
                        System.out.println(month.name());
                    }
                }
                break;
                //Вивести на екран всі місяці які мають меншу кількість днів
            case 4:
                System.out.println("Місяці, які мають меншу кількість днів:");
                for (Month month : Month.values()) {
                    if ((month.getDay()) < 31) {
                        System.out.println(month.name());
                    }
                }
                break;
                //Вивести на екран всі місяці які мають більшу кількість днів
            case 5:
                System.out.println("Місяці, які мають більшу кількість днів:");
                for (Month month : Month.values()) {
                    if ((month.getDay()) == 31 || month.getDay() == 30) {
                        System.out.println(month.name());
                    }
                }
                break;
                //Вивести на екран наступну пору року
            case 6:

                for (Month month : months) {
                    if (month.equalsIgnoreCase(monthget)) {
                        Seasons[] seasons1 = Seasons.values();
                        if (monthget.equalsIgnoreCase(String.valueOf(seasons1))) {
                            System.out.println(seasons1[month.season.ordinal() - 1]);
                        }
                    }
                    break;


                }
                //Вивести на екран всі місяці які мають парну кількість днів
            case 7:

                System.out.println("Список парних чисел в місяцях - ");
                for(Month month : months){
                    if(month.getDay()%2==0){
                        System.out.println(month.name());
                    }
                }
                break;
                //Вивести на екран всі місяці які мають непарну кількість днів
            case 8:

                System.out.println("Список не парних чисел в місяцях - ");
                for(Month month : months){
                    if(month.getDay()%2!=0){
                        System.out.print(month.name()+ " - " + month.getDay() + " ");

                    }
                }
                break;
                //Вивести на екран чи введений з консолі місяць має парну кількість днів
            case 9:

                int getPar;
                getPar = scanner.nextInt();
                System.out.println("Місяці, які мають парні числа");
                for(Month month : months){
                    if (month.equalsIgnoreCase(month.toString())) {
                        getPar = month.getDay();

                    }
                    if(getPar % 2==0){
                        System.out.println(month.name());
                    }
                }
                break;



        }
    }
}
