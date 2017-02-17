package com.training.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) {
        String s1 = getInput("Enter a number value : ");
        String s2 = getInput("Enter a number value : ");


        double result = addTwoValues(s1, s2);

        System.out.println("The result is : "+ result);


        double resultOfMultiple = addMultipleValues(1, 2, 3, 4, 5);

        System.out.println("The answer from multiple is : " + resultOfMultiple);
    }

    private static double addTwoValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;

        return result;
    }

    private static String getInput(String prompt) {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(prompt);
        System.out.flush();

        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            return "Error: "+ e.getMessage();
        }

    }

    private static double addMultipleValues(double ... values) {
        double result = 0d;
        for (double value : values) {
            result += value;
        }
        return result;
    }
}
