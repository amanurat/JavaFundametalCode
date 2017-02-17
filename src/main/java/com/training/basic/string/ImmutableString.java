package com.training.basic.string;

public class ImmutableString {

    public static void main(String[] args) {

        String str = "Hello";
        str.concat(" World").toLowerCase();

        System.out.println(str);
    }
}
