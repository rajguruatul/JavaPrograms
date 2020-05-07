package com.collections;


/*https://javahungry.blogspot.com/2019/02/collection-programs-in-java-for-interview.html
        Q16 Write a program to iterate the HashMap ?*/


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {

    public static void main(String[] args)
    {

        Map<Integer,String> hashMap=new HashMap<Integer, String>();
        hashMap.put(1,"Atul");
        hashMap.put(2,"Neha");
        hashMap.put(3,"CommingSoon");

        System.out.println("1. for-each loop and ketSet()");
        usingForLoop(hashMap);

        usingIteratorAndKeySet(hashMap);
        System.out.println("2. Iterating or looping Map Using keySet() and iterator");

        usingEntrySetAndForLoop(hashMap);
        System.out.println("3. Iterating or Looping Map in Java using entrySet() and for each Loop");

        usingEntrySetAndIterator(hashMap);
        System.out.println("4. Iterate or Loop HashMap in Java Using entrySet() and java iterator");

    }

//    4. Iterate or Loop HashMap in Java Using entrySet() and java iterator
    private static void usingEntrySetAndIterator(Map<Integer, String> hashMap) {
        Set<Map.Entry<Integer,String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = entrySet.iterator();
        while(iterator.hasNext())
        {
            Map.Entry entry =iterator.next();
            System.out.println(" Key : "+entry.getKey()+" | values : "+entry.getValue());
        }


    }

//    3. Iterating or Looping Map in Java using entrySet() and for each Loop
    private static void usingEntrySetAndForLoop(Map<Integer, String> hashMap) {
        Set<Map.Entry<Integer,String>> entrySet= hashMap.entrySet();
        for(Map.Entry entry : entrySet)
            System.out.println(" Key : "+entry.getKey()+" | value : "+entry.getValue());

    }


    //    2. Iterating or looping Map Using keySet() and iterator
    private static void usingIteratorAndKeySet(Map<Integer, String> hashMap) {

        Iterator<Integer> iterator=hashMap.keySet().iterator();
        while(iterator.hasNext())
        {
            int key = iterator.next();
            System.out.println("key : "+key+" | value : "+hashMap.get(key));
        }
    }

    // 1. for-each loop and ketSet()
    private static void usingForLoop(Map<Integer, String> hashMap) {
        for(int key : hashMap.keySet())
            System.out.println("key : "+key+" | value : "+hashMap.get(key));

    }
}
