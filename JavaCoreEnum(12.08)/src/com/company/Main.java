package com.company;


import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {




        MonthsMethod();



    }

    public static void MonthsMethod(){
        Month[] months = Month.values();
        Scanner scanner =  new Scanner(System.in);
        String monthget;
        monthget = scanner.nextLine();

        for(Month month : months){
            System.out.println(month);
        }
    }



    public static void monthCheck() {
        Month[] months = Month.values();
        int choice = 2;
        Scanner scanner = new Scanner(System.in);
        String enter;
        enter = scanner.nextLine();
        boolean checking = false;

        switch (choice) {
            case 1:



                for (Month month : months) {
                    if (enter.equalsIgnoreCase(month.toString())) {
                       checking = true;
                    }
                }
                if (checking) {
                    System.out.println("Місяць " + enter + " існує");
                } else
                    System.out.println("Такого місяця не існує");
                break;


            case 2:
                Seasons seasons ;

                for (Month month : months) {
                    if (enter.equalsIgnoreCase(month.toString())){
                        seasons = month.getSeason();
                        System.out.println(seasons);

                    }
                }



        }

    }
}


