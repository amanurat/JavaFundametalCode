package com.training.oop.overloading;

/**
 * Date: 10/3/2014
 * Time: 3:53 PM
 *
 * @author assanai.manurat
 */
public class MethodOverloading {

    private String name;

    private int age;

    //Default Constructor
    public MethodOverloading() {
    }

    //Overloading Constructor
    public MethodOverloading(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("initialize constructor...");

        System.out.println("name: " + name + ", age: "+ age);
    }

    void method(String name) {
        System.out.println("name: "+ name);
    }

    void method(int age) {
        System.out.println("age: "+ age);
    }

    void method(String name, int age) {
        System.out.println("name: " + name + ", age: "+ age);
    }

    public static void main(String[] args) {
        MethodOverloading demo1 = new MethodOverloading();
        demo1.method("name1");
        demo1.method(10);
        demo1.method("name1", 10);


        MethodOverloading demo2 = new MethodOverloading("name2", 20);


    }


}
