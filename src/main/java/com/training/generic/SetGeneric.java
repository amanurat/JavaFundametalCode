package com.training.generic;

import java.util.HashSet;
import java.util.Set;

public class SetGeneric {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one");
        set.add("second");
        set.add("3rd");
//        set.add(new Integer(40));  //compile error
        set.add("second");

        System.out.println(set);
    }
}
