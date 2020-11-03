package com.company;

import java.util.*;

public class Cinema {

    TreeMap<String,Schedule> schedules = new TreeMap<>();
    ArrayList<Movie> moviesLibrary = new ArrayList<>();
    Time open;
    Time close;

    public void addMovie(Movie movie){
        moviesLibrary.add(movie);
        System.out.println(moviesLibrary);
        //moviesLibrary.forEach(System.out::println);

    }
    public void addSeance(Seance seance,String days){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the movie");
        String title = scanner.nextLine();
        System.out.println("Enter duration movie:");
        System.out.println("Hours: ");
        int hours = scanner.nextInt();
        System.out.println("Minutes: ");
        int minutes = scanner.nextInt();

        //ADD SEANCE
        System.out.println("Add seance");
        System.out.println("Hours: ");
        int hoursStart = scanner.nextInt();
        System.out.println("Minutes: ");
        int minutesStart = scanner.nextInt();
        Time timeStart = new Time(minutesStart,hoursStart);
        System.out.println("Hours: ");
        int hoursEnd = scanner.nextInt();
        System.out.println("Minutes: ");
        int minutesEnd = scanner.nextInt();
        Time timeEnd = new Time(minutesEnd,hoursEnd);

        Time time = new Time(minutes,hours);
        Movie movie = new Movie(title,time);
        
        seance = new Seance(movie,timeStart,timeEnd);
        Schedule schedule = new Schedule();
        schedule.addSeanceToSchedule(seance);
        schedules.put(days,schedule);

    }
    public void RemoveMovie(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the movie");
        String title = scanner.nextLine();
        System.out.println("Enter duration movie:");
        System.out.println("Hours: ");
        int hours = scanner.nextInt();
        System.out.println("Minutes: ");
        int minutes = scanner.nextInt();

        Time time = new Time(minutes,hours);
        Movie movie = new Movie(title,time);
        moviesLibrary.add(movie);
        //////////
        String str = scanner.nextLine();
       /* if(moviesLibrary.equals(str)){*/
         moviesLibrary.clear();
        /*}else System.out.println("Movie doesn't exist");*/
        System.out.println(moviesLibrary);
    }
    public void removeSeance(Seance seance,String day){
        addSeance(seance,day);
        Set<Map.Entry<String, Schedule>> set = schedules.entrySet();
        Iterator<Map.Entry<String, Schedule>> iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Schedule> scheduleEntry = iterator.next();
            if(scheduleEntry.getKey().contains(seance.toString()) && scheduleEntry.getKey().contains(seance.toString())){
            iterator.remove();
            }
        }
        System.out.println(seance);
    }


    @Override
    public String toString() {
        return "schedules:" + schedules + moviesLibrary;
    }


}
