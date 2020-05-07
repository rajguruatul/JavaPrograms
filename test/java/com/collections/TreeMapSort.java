package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSort {
    public  static  void main(String[] args)
    {
        Map<String,String> treeMap = new TreeMap<String, String>();

        treeMap.put("Atul","Liverpool");
        treeMap.put("Neha","Pune Fc");
        treeMap.put("Abhilash","Manchester Utd");
        treeMap.put("Deepro","chelsea Fc");
        treeMap.put("Nibin","Bayern FC");

        for(String str : treeMap.keySet())
            System.out.println("key : "+str+ " | Value : "+treeMap.get(str));


    }
}
