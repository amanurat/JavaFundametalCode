package com.training.oop.inheritance.abstracts;

/**
 * Created by amanurat on 11/14/14 AD.
 */
public abstract class Shap {
    double width;
    double height;

    public Shap(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract double area();

}
