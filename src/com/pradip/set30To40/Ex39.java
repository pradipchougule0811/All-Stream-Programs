package com.pradip.set30To40;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Find all Employee having salary less than 3rd highest salary
public class Ex39 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("akshay",2000));
        emp.add(new Employee("varun",1900));
        emp.add(new Employee("ajay",2100));
        emp.add(new Employee("nitin",2200));
        List<Employee> less3Salary = emp.stream().sorted((a1, a2) -> Integer.compare(a2.getSalary(), a1.getSalary()))
                .skip(3)
                .collect(Collectors.toList());

        System.out.println("Employee List");
        System.out.println(emp);
        System.out.println("Less than 3rd highest Salary"+less3Salary);
    }
}
/**
 * output
 * Employee List
 * [Employee{name='akshay', salary=2000}, Employee{name='varun', salary=1900}, Employee{name='ajay', salary=2100}, Employee{name='nitin', salary=2200}]
 * Less than 3rd highest Salary[Employee{name='varun', salary=1900}]
 */