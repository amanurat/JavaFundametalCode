package com.training.oop.innerclass;

public class Outer {

    private String thoughts = "My outer thoughts";

    private String information = "My Information";

    class Inner {
        String thoughts = "My inner thoughts";

        //static String myStaticInformation = "My Static Information"; // Cannot declaring static on inner class

        void doStuff() {
            // inner object has its own "this"
            System.out.println(this.thoughts);

            // and it also has a kind of "outer this"
            // even for private data of outer class
            System.out.println(Outer.this.thoughts);
            System.out.println(information);
        }
    }
    static class Inner2 {
        String thoughts = "My inner2";

        void doStuff() {
            // inner object has its own "this"
            System.out.println(thoughts);

            //System.out.println(information); //Cannot access member of Outer class

        }
    }

    public static void main(String[] args) {
        // instantiate me, the outer object
        Outer o = new Outer();

        // Inner i = new Inner();
        // NO! Can't instantiate Inner by itself!

        Outer.Inner i = o.new Inner();
        // now I have my special inner object
        i.doStuff();
        // OK to call methods on inner object


        Inner2 inner2 = new Outer.Inner2();
        inner2.doStuff();
    }

}