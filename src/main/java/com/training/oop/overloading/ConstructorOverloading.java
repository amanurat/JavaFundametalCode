package com.training.oop.overloading;

/**
 * Created by amanurat on 9/13/14 AD.
 */

public class ConstructorOverloading {

    public ConstructorOverloading(){
        char value[] = { 'a','c'};


        String char1 = new String(new char[]{'t','e','s','t'});

        String char2 = new String(new char[]{'t','e','s','t'});

        System.out.println("char1 : " + char1);
        System.out.println("char2 : " + char2);


        if (char1.equals(char2)) {
            System.out.println("String is equal");
        } else {
            System.out.println("String not equal");
        }


        System.out.println("Inside default constructor");
    }
    public ConstructorOverloading(int i){
        System.out.println("Inside single parameter constructor with int value");
    }
    public ConstructorOverloading(String str){
        System.out.println("Inside single parameter constructor with String object");
    }
    public ConstructorOverloading(int i, int j){
        System.out.println("Inside double parameter constructor with int value");
    }

    public static void main(String a[]){
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading(10);
        ConstructorOverloading obj2 = new ConstructorOverloading(10,20);
        ConstructorOverloading obj3 = new ConstructorOverloading("hello");
    }
}