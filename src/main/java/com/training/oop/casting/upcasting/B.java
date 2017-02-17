package com.training.oop.casting.upcasting;

/**
 * Created by amanurat on 11/12/14 AD.
 */
class A {
    public void print() {
        System.out.println("Hello from class A");
    }
    public void show() { System.out.println("Show from class A");}
}
public class B extends A {
    public void print() {
        System.out.println("Hello from class B");
    }

    public static void main(String[] args) {
        //Once you have upcast an object reference, you can access only the fields and methods declared by the base class.
        A obj = new B();
        obj.print();
        obj.show();

        B bObj = new B();
        bObj.print();
        bObj.show();

        A aObj = new A();
        aObj.print();
        aObj.show();

        //An upcast reference can be downcast to a subclass through explicit casting.
        A aa = new B();

        B bb = (B) aa;
        bb.print();


        B b = new B();
        b.show();





    }
}