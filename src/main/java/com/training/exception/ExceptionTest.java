package com.training.exception;

public class ExceptionTest {


    public static void main(String[] args) {

        try {
            aMethod();

        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("finished");


    }

    private static void aMethod() throws Exception {

        try {
//            throw new Exception();

            System.out.println("AA");
        } finally {
            System.out.println("finally");
        }


    }
}
