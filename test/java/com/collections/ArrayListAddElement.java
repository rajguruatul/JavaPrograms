package com.collections;

//Q20 Write a program to add element at particular index of ArrayList?
//Q21 Write a program to remove element from specified index of ArrayList?

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddElement
{
    public static void main(String[] args)
    {
        List<String> epl = new ArrayList<String>();
        epl.add("Liverpool FC");
        epl.add("Manchester Utd");
        epl.add("Manchester City");
        epl.add("Arsenal");

        for(String s:epl)
            System.out.println(s);

        System.out.println("Inserting spurs at 2nd position");
        epl.add(1,"Spurs");

        for(String s1:epl)
            System.out.println(s1);

        System.out.println("Removing man utd from the current list of top clubs in EPL");
        //epl.remove("Manchester Utd");
        epl.remove(2);

        for(String s2:epl)
            System.out.println(s2);
    }
}
