package com.collections.comprableVcomprator;

import java.util.Comparator;

public class NameCompare implements Comparator<Family>
{

    @Override
    public int compare(Family o1, Family o2) {
        return (o1.name.compareTo(o2.name));
    }
}
