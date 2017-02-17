package com.training.collections.list;

import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String args[ ]) {

        LinkedList link = new LinkedList();

        link.add(new Double(2.0));
        link.addLast(new Double(3.0));
        link.addFirst(new Double(1.0));
        link.add(new Double(4.4));

        Object array[ ] = link.toArray( );

        for(int x=0; x<link.size(); x++) {
            System.out.println(array[x]);
        }
    }
}
