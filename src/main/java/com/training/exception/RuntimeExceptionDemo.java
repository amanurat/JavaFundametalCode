package com.training.exception;

/**
 * Date: 10/3/2014
 * Time: 12:11 PM
 *
 * @author assanai.manurat
 */
public class RuntimeExceptionDemo {


    public static void main(String args[]) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
