package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Month[] months =  Month.values();
        for(Month month : months){
           /* if(month.days<Month.JANUARY.days){
                System.out.println(month);
            }*/
            System.out.println(month);
        }




    }
    public static void Case(){
        Scanner scanner =  new Scanner(System.in);
        int  check =  scanner.nextInt();


        switch (check){
            case 1:
                Month[] months =  Month.values();
                for(Month month : months){
                    if(check==months)
                }

        }



    }
}
