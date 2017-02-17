package com.training.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MyHashMapIteratorEntrySet {

    public static void main(String args[ ]) {

        HashMap<String, String> map = new HashMap();
        map.put("name", "Jody");
//        map.put("id", new Integer(446)); // Compile error because value must be String
        map.put("address", "Manila");
        map.put(null, "null value"); // Key can be assign with null

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}