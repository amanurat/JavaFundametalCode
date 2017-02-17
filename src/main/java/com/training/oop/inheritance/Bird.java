package com.training.oop.inheritance;

/**
 * Created by amanurat on 11/14/14 AD.
 */
public class Bird extends Animal implements Fly {

    @Override
    public void walk() {

        System.out.println("Bird walking...");
    }


    @Override
    public void fly() {
        System.out.println("Bird flying...");
    }
}
