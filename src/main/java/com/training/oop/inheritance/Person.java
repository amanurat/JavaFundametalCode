package com.training.oop.inheritance;

/**
 * Created by amanurat on 11/13/14 AD.
 */
public class Person {

    private String body;
    private String firstName;
    private String lastName;
    private String gender;
    private String idCard;
    private String address;
    private String birthDate;
    private int age;
    private String mobile;

    public Person(){
        System.out.println("com.training.oop.inheritance.Person constructor");
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String aa() {

        return "aa";
    }

    public void walk() {
        System.out.println("walking...");
    }

    public static void main(String[] args) {
        Person person = new Person("Assanai", "Manurat");
//        person.walk();
//        person.lastName = "Manurat";
//        System.out.println("first name is : "+ person.firstName);
//        System.out.println("last name is : "+ person.lastName);

        System.out.println(person);

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.training.oop.inheritance.Person{");
        sb.append("body='").append(body).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", idCard='").append(idCard).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", birthDate='").append(birthDate).append('\'');
        sb.append(", age=").append(age);
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
