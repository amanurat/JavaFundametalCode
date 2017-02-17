package com.training.oop.argument;

import java.util.ArrayList;
import java.util.List;

public class PassingArguments {

    static void set(int a) {
        a = 10;
    } // Primitive type cannot change value

    static void set(int[] a) {
        a[0] = 10;
    }

    static void set(List<String> a) {
//        a.set(0, "Hello"); // Change object will effect the original since copy point memory address

        List<String> b = new ArrayList<>();
        a = b; //Object Replace the change will not propagate back to the caller

    }

    public static void main(String[] args) {
        PassingArguments m = new PassingArguments();
        int x = 0; // value data type
        m.set(x); // value is passed
        System.out.println(x); // 0


        int[] y = {0}; // reference data type
        m.set(y); // address is passed
        System.out.println(y[0]); // 10

        List l = new ArrayList();
        l.add("Hi");
        m.set(l);
        System.out.println(l);
    }


}
