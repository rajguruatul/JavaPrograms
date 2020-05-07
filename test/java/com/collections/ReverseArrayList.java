package com.collections;

import java.lang.reflect.Array;
import java.util.*;

public class ReverseArrayList
{

    public static void main(String[] args)
    {
        List<String> hashset_tcSim= new ArrayList<String>();
        //adding TcSim team members
        hashset_tcSim.add("Manish Ayachit");
        hashset_tcSim.add("Ketan Choudhary");
        hashset_tcSim.add("Kartik Pai");
        hashset_tcSim.add("Atul Rajguru");
        hashset_tcSim.add("Jasveen Kaur");
        hashset_tcSim.add("Siddraj Sambargi");
        hashset_tcSim.add("Harmohan Singh");

        System.out.println("Before sorting the list : ");
        for(String s:hashset_tcSim)
            System.out.print(s+" | ");

        Collections.reverse(hashset_tcSim);
        System.out.println("\nAfter sorting the list : ");
        for(String s:hashset_tcSim)
            System.out.print(s+" | ");






    }




}
