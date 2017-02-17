package com.training.collections.list;

import java.util.Vector;

public class MyVector {

    public static void main(String args[]) {

        Vector vector = new Vector();

        vector.add(new Integer(1));
        vector.add(new Integer(2));
        vector.add(new Integer(3));

        for (int x = 0; x < 3; x++) {
            System.out.println(vector.get(x));
        }
    }
}