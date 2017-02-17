package com.training.oop.overriding;

/**
 * Date: 10/2/2014
 * Time: 4:36 PM
 *
 * @author assanai.manurat
 */
class Animal {

    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {

    public void move() {
//        super.move();// invokes the super class method
        System.out.println("Dogs can walk and run");
    }
}

public class OverrideDemo {

    public static void main(String args[]) {
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object

        a.move();// runs the method in Animal class
        b.move();//Runs the method in Dog class
    }
}