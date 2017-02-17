package com.training.collections.map;

import java.util.Hashtable;

public class MyHashtable {

    public static void main(String args[ ]) {

        Hashtable table = new Hashtable( );
        table.put("name", "Jody");
        table.put("id", new Integer(1001));
        table.put("address", new String("Manila"));
//        table.put(null, null); // Key cannot be null will throw NullPointerException

        System.out.println("Table of Contents:" + table);
    }
}