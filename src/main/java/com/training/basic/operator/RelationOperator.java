package com.training.basic.operator;

public class RelationOperator {

    public static void main(String[] args) {

        int x = 5;
        int y = 3 + 2;

// Does not compile
        /*if (x = y) {
            // Do something
        }*/

// You must use equality operator
        if (x == y) {
            // Do something
        }


    }
}
