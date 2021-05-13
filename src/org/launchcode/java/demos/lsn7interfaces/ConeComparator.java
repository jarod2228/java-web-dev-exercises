package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator {
    @Override
    public int compare(cone o1, cone o2) {
        // do stuff like flavor comparator did but by cost least to most expensive;
        o1.getCost() - o2.getCost();

    }
}
