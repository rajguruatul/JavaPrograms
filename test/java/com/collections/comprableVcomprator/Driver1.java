package com.collections.comprableVcomprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver1
{

    public static void main(String[] args)
    {
        List<Family> familyList = new ArrayList<Family>();
        familyList.add(new Family("Atul",       29,72.5f));
        familyList.add(new Family("Neha",       29,50.5f));
        familyList.add(new Family("Mom" ,       53,60.5f));
        familyList.add(new Family("Dad" ,       56,102.5f));
        familyList.add(new Family("Sandeep",    34,85.5f));
        familyList.add(new Family("Chailtali",  34,72.5f));
        familyList.add(new Family("Chinmay",    8 ,20.5f));
        familyList.add(new Family("Pari",       1 ,00.5f));

        System.out.println("--------------------------Sort by Age using Comparable--------------------------------------------------");
        //Using Comparable
        Collections.sort(familyList);
        for(Family f : familyList)
            f.displayFamily();


        // Using Comparator
        NameCompare nameCompare =new NameCompare();
        WeightCompare weightCompare = new WeightCompare();

        System.out.println("--------------------------Sort by Name using Comparator--------------------------------------------------");
        Collections.sort(familyList,nameCompare);
        for(Family f : familyList)
            f.displayFamily();

        System.out.println("--------------------------Sort by Weight using Comparator--------------------------------------------------");
        Collections.sort(familyList,weightCompare);
        for(Family f : familyList)
            f.displayFamily();



    }

}
