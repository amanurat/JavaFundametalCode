package com.training.basic.loop;

public class WhileLoop {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("====================================");
        System.out.println("While Loop");
        System.out.println("====================================");
        int counter = 0;
        while (counter < months.length) {
            System.out.println(months[counter]);
            counter++;
        }

    }
}
