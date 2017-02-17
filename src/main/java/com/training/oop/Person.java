package com.training.oop;

/**
 * Date: 10/2/2014
 * Time: 3:51 PM
 *
 * @author assanai.manurat
 */
public class Person {

    private String firstName;

    private String lastName;

    private int age;

    //Default Constructor
    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
