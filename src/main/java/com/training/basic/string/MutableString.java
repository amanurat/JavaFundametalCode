package com.training.basic.string;

public class MutableString {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        System.out.println(stringBuilder);


        stringBuilder.toString().concat("!!");
        System.out.println(stringBuilder);


    }
}
