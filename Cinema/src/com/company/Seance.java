package com.company;

public class Seance implements Comparable<Seance>{
    Movie movie;
    Time starTime;
    Time endTime;

    public Seance(Movie movie, Time starTime, Time endTime) {
        this.movie = movie;
        this.starTime = starTime;
    }


    @Override
    public int compareTo(Seance o) {
        if (this.movie == o.movie) {
            return 0;
        } else if (this.movie.equals(o.movie)){
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return
                "movie=" + movie +
                ", starTime=" + starTime +
                ", endTime=" + endTime;
    }
}
