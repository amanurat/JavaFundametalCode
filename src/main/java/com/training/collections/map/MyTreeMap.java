package com.training.collections.map;

import java.util.*;

public class MyTreeMap {

    public static void main(String args[]) {

        TreeMap treeMap = new TreeMap( );

        treeMap.put("name", "Jody");
        treeMap.put("id", new Integer(446));
        treeMap.put("address", "Manila");

        Collection values = treeMap.values();
        Iterator iterator = values.iterator( );


        while (iterator.hasNext()) {
            System.out.println(iterator.next( ));
        }


        System.out.println("============= Iteration tree map with Entry ===========");

        TreeMap<String, String> treeMapGeneric = new TreeMap<>();

        treeMapGeneric.put("Thailand", "Thailand");
        treeMapGeneric.put("Japan", "Japan");
        treeMapGeneric.put("English", "English");
        for (Map.Entry<String, String> entry : treeMapGeneric.entrySet()) {
            System.out.println(entry.getKey() + " " +entry.getValue());
        }



    }
}
