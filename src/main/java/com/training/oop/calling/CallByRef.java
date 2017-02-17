package com.training.oop.calling;

/**
 * Created by amanurat on 3/11/15 AD.
 */
public class CallByRef {

    public static void main(String args[]) {
        Called ob = new Called(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
