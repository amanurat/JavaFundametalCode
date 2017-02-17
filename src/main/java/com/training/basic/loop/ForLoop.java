package com.training.basic.loop;
public class ForLoop {

    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("====================================");
        System.out.println("For Loop");
        System.out.println("====================================");
        for (String month : months) {
            System.out.println(month);

        }

    }
}
