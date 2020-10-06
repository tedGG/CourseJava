package com.company;

import java.util.Comparator;

public class SortNameComparator implements Comparator<Comodity> {

    @Override
    public int compare(Comodity o1, Comodity o2) {
        return o1.getNameComodity().compareTo(o2.getNameComodity());
    }
}
