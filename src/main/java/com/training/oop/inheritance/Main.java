package com.training.oop.inheritance;

public class Main {

    public static void main(String[] args) {

//        com.training.oop.inheritance.Person person = new com.training.oop.inheritance.Person("a", "m");
//        System.out.println(person);

        Student student = new Student();
        student.setFirstName("I am a student");
        student.setLastName(" xxxxx");

        System.out.println("student first name is : " + student.getFirstName());
        System.out.println("student last name is : " + student.getLastName());

        student.walk();
        System.out.println(student.aa());
    }
}
