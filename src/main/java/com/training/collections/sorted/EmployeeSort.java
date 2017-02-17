package com.training.collections.sorted;

import java.util.*;

/**
 * Date: 10/3/2014
 * Time: 11:39 AM
 *
 * @author assanai.manurat
 */
public class EmployeeSort {
    static final Comparator<Employee> SENIORITY_ORDER =
            new Comparator<Employee>() {
                public int compare(Employee e1, Employee e2) {
                    return e2.getNumber().compareTo(e1.getNumber());
//                    return e2.getName().compareTo(e1.getName());
//                    return e2.getHireDate().compareTo(e1.getHireDate());
                }
            };

    public static void main(String[] args) {
        List<Employee> e = new ArrayList<Employee>();
        e.add(new Employee(new Name("A", "A"), 10, new Date()));
        e.add(new Employee(new Name("B", "B"), 20, new Date()));


        Collections.sort(e, SENIORITY_ORDER);
        System.out.println(e);
    }
}

class Employee {

    private Name name;
    private Integer number;
    private Date hireDate;


    Employee(Name name, int number, Date hireDate) {
        this.name = name;
        this.number = number;
        this.hireDate = hireDate;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name=").append(name);
        sb.append(", number=").append(number);
        sb.append(", hireDate=").append(hireDate);
        sb.append('}');
        return sb.toString();
    }
}
