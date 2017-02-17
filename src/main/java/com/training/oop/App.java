package com.training.oop;

import com.training.oop.Person;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Date: 10/2/2014
 * Time: 3:54 PM
 *
 * @author assanai.manurat
 */
public class App {


    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("person: " + person);


        String s = "Hello ".concat(" World");
        System.out.println(s);
        s.concat(" Program!");
        System.out.println(s);


        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);

        sb.append(" Program!");

        System.out.println(sb);

    }

}
