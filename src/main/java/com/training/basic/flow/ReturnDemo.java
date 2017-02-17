package com.training.basic.flow;
public class ReturnDemo {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for (int value : numbers) {


            if (value == 3) {
                continue;
            }

            System.out.println(value);

        }



    }
}
