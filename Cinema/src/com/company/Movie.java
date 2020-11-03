package com.company;

public class Movie {
    String title;
    Time duration;

    public Movie(String title, Time duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return title + ", " + "Duration: " + duration;
    }

    public String getTitle() {
        return title;
    }

    public Time getDuration() {
        return duration;
    }
}
