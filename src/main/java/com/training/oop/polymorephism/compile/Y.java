package com.training.oop.polymorephism.compile;

class X {
    void methodA(int num) {
        System.out.println("methodA: " + num);
    }

    void methodA(int num1, int num2) {
        System.out.println("methodA: "+ num1 + ", "+ num2);
    }

    double methodA(double num) {
        System.out.println("methodA: "+ num);
        return num;
    }
}

public class Y {

    public static void main(String[] args) {
        X obj = new X();
        double result;
        obj.methodA(20);
        obj.methodA(20, 30);
        result = obj.methodA(5.5);
        System.out.println("Answer : is " + result);
    }
}
