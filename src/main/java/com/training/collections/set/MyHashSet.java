package com.training.collections.set;

/**
 * Created by amanurat on 3/17/15 AD.
 */
import java.util.*;

public class MyHashSet {

    public static void main(String args[ ]) {

        HashSet hash = new HashSet( );

        hash.add("a");
        hash.add("b");
        hash.add("c");
        hash.add("d");

        Iterator iterator = hash.iterator( );

        while(iterator.hasNext( )) {
            System.out.println(iterator.next( ));
        }
    }
}
