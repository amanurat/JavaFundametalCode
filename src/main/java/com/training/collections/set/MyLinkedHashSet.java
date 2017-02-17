package com.training.collections.set;

/**
 * Created by amanurat on 3/17/15 AD.
 */
import java.util.LinkedHashSet;

public class MyLinkedHashSet {

    public static void main(String args[ ]) {

        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add(new String("One"));
        lhs.add(new String("Two"));
        lhs.add(new String("Three"));

        Object array[] = lhs.toArray( );

        for(int x=0; x<3; x++) {
            System.out.println(array[x]);
        }
    }
}