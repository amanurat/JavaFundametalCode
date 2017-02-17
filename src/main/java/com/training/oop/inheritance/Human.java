package com.training.oop.inheritance;

/**
 * Created by amanurat on 3/12/15 AD.
 */
public class Human extends Life {

    public Human() {
        System.out.println("The Human constructor...");
    }

    public Human(String msg) {
        super(msg);
        System.out.println("The Human constructor with string parameter...");
    }

}
