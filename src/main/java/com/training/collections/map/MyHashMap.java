package com.training.collections.map;

import java.util.HashMap;

public class MyHashMap {

    public static void main(String args[ ]) {

        HashMap map = new HashMap( );
        map.put("name", "Jody");
        map.put("id", new Integer(446));
        map.put("address", "Manila");
        map.put(null, "null value"); // Key can be assign with null


        System.out.println("Name: " + map.get("name"));
        System.out.println("ID: " + map.get("id"));
        System.out.println("Address: " + map.get("address"));
        System.out.println("null: " + map.get(null));


    }
}