package com.training.basic.string;

class SubStr {

    public static void main(String args[]) {
        String original = "Java makes the Web move.";

        String sub = original.substring(5, 18);
        System.out.println("original: " + original);
        System.out.println("sub: " + sub);

        original.substring(5, 18); // String is immutable type cannot change
        System.out.println("result: " + original);


    }
}
