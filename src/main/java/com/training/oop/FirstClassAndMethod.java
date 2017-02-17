package com.training.oop;

/**
 * Created by amanurat on 7/20/14 AD.
 */
public class FirstClassAndMethod {

    public static void main(String[] args) {

        doSomething();

        int top = 20;

        loopMe(top);
    }

    private static void loopMe(int top) {
        for (int i = 0; i < top; i++) {
            System.out.println("the value is " + i);

        }
    }

    private static void doSomething() {
        System.out.println("This method has been called");
    }
}
