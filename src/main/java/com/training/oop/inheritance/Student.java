package com.training.oop.inheritance;

/**
 * Created by amanurat on 11/13/14 AD.
 */
public class Student extends Person {


    private String studentId;

    public Student() {
//        super();

        this("Assanai");
    }

    public Student(String firstName) {
        super(firstName);
    }

    @Override
    public void walk() {
        System.out.println("I am student walking...");
        super.walk();

    }


    public String aa() {

        return super.aa() + ", bb";
    }

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
