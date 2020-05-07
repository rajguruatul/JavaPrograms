package com.collections.comprableVcomprator;

import java.util.Comparator;

public class WeightCompare implements Comparator<Family>
{

    @Override
    public int compare(Family o1, Family o2)
    {
        //this will sort ASCENDING
        if      (o1.weight  >   o2.weight) return 1;
        else if (o1.weight  <   o2.weight) return -1;
        else                               return 0;

/*        to sort in DESCENDING order
        return (1)true when o2.weight > o1.weight*/
    }
}
