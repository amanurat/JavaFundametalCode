package com.training.basic.inputstream;

import java.io.*;
import java.text.*;

// shows how to read a double the hard way
public class ReadDoubleTest {

    public static void main(String[] args) {
        System.out.println("Enter a number, I'll add two to it.");
        double x; // the number we wish to read
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            DecimalFormat df = new DecimalFormat();
            Number n = df.parse(s);
            x = n.doubleValue();
        } catch (IOException e) {
            x = 0;
        } catch (ParseException e) {
            x = 0;
        }
        System.out.println(x + 2);
    }
}   




