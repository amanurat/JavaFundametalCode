package com.training.generic;

import java.util.ArrayList;

/**
 * Date: 10/3/2014
 * Time: 10:31 AM
 *
 * @author assanai.manurat
 */
public class GenericBox<T> {

    T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public static void main(String[] args) {
        System.out.println("========== Generic Box==============");
        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>();
        integerGenericBox.set(new Integer(1));
        Integer output = integerGenericBox.get();
        System.out.println(output);

        System.out.println("=========== Generic ArrayList =============");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(new Integer(1));
        arrayList.add(new Integer(2));
        for (int i = 0; i < arrayList.size(); i++) {
            Number number = arrayList.get(i);
            System.out.println(number);
        }

        System.out.println("=========== For Enhance String Arrays =============");
        String[] strings = {"A", "B"};
        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println("=========== For Enhance Object Arrays =============");
        Object[] objects  = new Object[2];
        objects[0] = new Integer(1);
        objects[1] = new Long(2);

        for (Object object : objects) {
            System.out.println(object);
        }


    }
}
