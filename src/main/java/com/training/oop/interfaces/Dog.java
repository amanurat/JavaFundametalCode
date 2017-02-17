package com.training.oop.interfaces;

/**
 * Date: 10/2/2014
 * Time: 4:24 PM
 *
 * @author assanai.manurat
 */
interface Animal{}

class Mammal implements Animal{}

public class Dog extends Mammal{
    public static void main(String args[]){

        Mammal m = new Mammal();
        Dog d = new Dog();

        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}