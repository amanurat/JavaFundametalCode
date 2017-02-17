package com.training.generic;

import java.util.ArrayList;

/**
 * Date: 10/3/2014
 * Time: 10:27 AM
 *
 * @author assanai.manurat
 */
class SimpleBox {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }

    public static void main(String[] args) {
        System.out.println("========== Simple Box ==============");
        SimpleBox simpleBox = new SimpleBox();
        simpleBox.set(new Long(1));
        Long output = (Long) simpleBox.get();
        System.out.println(output);

        System.out.println("========== For Arrays ==============");
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add(new Integer(1));
        arrayList.add(new Long(2));

        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            System.out.println(obj);
//            Integer integer = (Integer)obj;
//            System.out.println(integer);
        }
    }
}


