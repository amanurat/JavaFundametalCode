package com.training.oop.inheritance;

/**
 * Created by amanurat on 11/14/14 AD.
 */
public class AnimalWalk {


    public AnimalWalk() {

        System.out.println("Begin AnimalWalk in constructor");

        //call the walking method
//        walking();
//        doPolymorphism();

        Bird bird = new Bird();
        bird.walk();
        bird.fly();


    }

    private void doPolymorphism() {
        Animal dog = new Dog();
        Animal cat = new Cat();

//        walking(dog);
//        walking(cat);


        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Cat();


        for (Animal animal : animals) {
            walking(animal);
        }
    }

    private void walking(Animal animal) {
        animal.walk();
    }

    private void walking() {
        System.out.println("Begin walking");
    }

    public static void main(String[] args) {
        new AnimalWalk();
    }


}
