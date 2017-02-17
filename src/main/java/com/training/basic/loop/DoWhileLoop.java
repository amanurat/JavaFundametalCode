package com.training.basic.loop;

public class DoWhileLoop {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


        int counter = 0;
        System.out.println("====================================");
        System.out.println("Do While Loop");
        System.out.println("====================================");
        do {
            System.out.println(months[counter]);
            counter++;
        } while (counter < months.length);


    }
}
