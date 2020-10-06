package com.company;

import java.util.Comparator;

public class BribesizeComparator implements Comparator<Deputy> {
    @Override
    public int compare(Deputy o1, Deputy o2) {
        if (o1.getBribesize()>o2.getBribesize())
            return 1;
        else if (o1.getBribesize()<o2.getBribesize())
            return -1;

        else return 0;
    }
}
