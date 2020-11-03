package com.company;


import java.util.Set;
import java.util.TreeSet;

public class Schedule {

    Set<Seance> seances = new TreeSet<>();

    public void addSeanceToSchedule(Seance seance){
        seances.add(seance);
    }
    public void removeSeance(Seance seance){
        seances.remove(seance);

    }

    @Override
    public String toString() {
        return "Seance: " + seances;
    }
}
