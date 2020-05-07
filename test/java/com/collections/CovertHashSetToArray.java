package com.collections;

import java.util.HashSet;
import java.util.Set;

public class CovertHashSetToArray
{

    public static void main(String[] args)
    {
        Set<String> hashset_tcSim= new HashSet<String>();
        //adding TcSim team members
        hashset_tcSim.add("Manish Ayachit");
        hashset_tcSim.add("Ketan Choudhary");
        hashset_tcSim.add("Kartik Pai");
        hashset_tcSim.add("Atul Rajguru");
        hashset_tcSim.add("Jasveen Kaur");
        hashset_tcSim.add("Siddraj Sambargi");
        hashset_tcSim.add("Harmohan Singh");

        String[] tscim_Array = new String[hashset_tcSim.size()];
        hashset_tcSim.toArray(tscim_Array);

        System.out.println("After Conversion to array");
        for(String s:tscim_Array)
            System.out.println(s);


    }
}
