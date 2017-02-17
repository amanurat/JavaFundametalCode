package com.training.collections.set;

/**
 * Created by amanurat on 3/17/15 AD.
 */
import java.util.TreeSet;
import java.util.Iterator;

public class MyTreeSet {

    public static void main(String args[ ]) {

        TreeSet tree = new TreeSet();

        tree.add("Jody");
        tree.add("Remiel");
        tree.add("Reggie");
        tree.add("Philippe");

        Iterator iterator = tree.iterator( );

        while(iterator.hasNext( )) {
            System.out.println(iterator.next( ).toString( ));
        }
    }
}