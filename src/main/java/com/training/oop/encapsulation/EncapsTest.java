package com.training.oop.encapsulation;

/**
 * Date: 10/3/2014
 * Time: 4:20 PM
 *
 * @author assanai.manurat
 */
class EncapsulationDemo {
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN() {
        return ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int newValue) {
        empAge = newValue;
    }

    public void setEmpName(String newValue) {
        empName = newValue;
    }

    public void setEmpSSN(int newValue) {
        ssn = newValue;
    }
}

public class EncapsTest {
    public static void main(String args[]) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
