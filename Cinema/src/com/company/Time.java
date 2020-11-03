package com.company;



public class Time {
    int min;
    int hour;

    public Time(int min, int hour) {
        this.min = min;
        this.hour = hour;

    }
    public void limitation(){
        if (min>60){
            System.out.println("You wrote: "+getMin()+" this minutes doesn't exist");
        }
        if(hour>24){
            System.out.println("You wrote: "+getHour()+" this hour doesn't exist");
        }
    }



    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return hour + ":" + min;
    }

}
