package com.training.oop.inheritance.abstracts;

/**
 * Created by amanurat on 11/14/14 AD.
 */
public class Rectangle extends Shap {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public double area() {
        return width * height;
    }


}
