package com.training.oop.calling;

public class CallByValue {

    public static void main(String args[]) {
        Called ob = new Called();
        int a = 15, b = 20;
        System.out.println("a and b before call: " + a + " " + b);
        ob.noChange(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }
}

