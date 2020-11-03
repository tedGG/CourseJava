package com.company;

import java.util.Scanner;

public class Main {
    static Cinema cinema = new Cinema();
    static Time time;
    static Movie movie;
    static Seance seance;

    public static void main(String[] args) {
        System.out.println("Select the operation what you want to do");
        System.out.println("1.Add movie");
        System.out.println("2.Add seance");
        System.out.println("3.Remove movie");
        System.out.println("4.Remove seance");
        Menu();
    }
    public static void Menu(){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.nextLine();
        switch (value){
            case 1:{
                System.out.println("Enter the movie");
                String title = scanner.nextLine();
                System.out.println("Enter duration movie:");
                System.out.println("Hours: ");
                int hours = scanner.nextInt();
                System.out.println("Minutes: ");
                int minutes = scanner.nextInt();

                time = new Time(minutes,hours);
                movie = new Movie(title,time);
                cinema.addMovie(movie);
            }
            break;
            case 2:{
                System.out.println("Enter day: ");
                String day = scanner.nextLine();

                cinema.addSeance(seance,day);
                System.out.println(cinema);
            }break;
            case 3:{
                cinema.RemoveMovie();
                break;
            }
            case 4:{
                System.out.println("Enter day: ");
                String day = scanner.nextLine();
                cinema.removeSeance(seance,day);

            }
        }
    }
}
