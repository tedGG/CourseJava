package com.company;

import java.util.Comparator;

public class SortInt implements Comparator<Comodity> {

    @Override
    public int compare(Comodity o1, Comodity o2) {
        return (int) (o1.getWeight()-o2.getWeight());
    }
}
