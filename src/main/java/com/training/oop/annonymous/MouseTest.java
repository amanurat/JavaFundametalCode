package com.training.oop.annonymous;

public class MouseTest {

    public static void main(String[] args) {

        Mouse mouse = new Mouse(){
            @Override
            public void click() {
                System.out.println("I am click mouse...");
            }
        };

        mouse.click();


        DoubleClick doubleClick = new DoubleClick() {
            @Override
            public void doubleClick() {
                System.out.println("I am double click mouse...");
            }
        };

        doubleClick.doubleClick();





    }
}
