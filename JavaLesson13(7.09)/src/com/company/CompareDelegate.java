package com.company;

import java.util.Comparator;

public class CompareDelegate implements Comparator<Deputy> {
    @Override
    public int compare(Deputy o1, Deputy o2) {
        return o1.getBribesize() - o2.getBribesize();
    }
}
