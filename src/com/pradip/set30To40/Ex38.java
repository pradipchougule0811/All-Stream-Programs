package com.pradip.set30To40;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Fetch top 3 employee based on salary
public class Ex38 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("akshay",2000));
        emp.add(new Employee("varun",1900));
        emp.add(new Employee("ajay",2100));
        emp.add(new Employee("nitin",2200));
        List<Employee> top3Salary = emp.stream().sorted((a1, a2) -> Integer.compare(a2.getSalary(), a1.getSalary()))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Employee List");
        System.out.println(emp);
        System.out.println("Top 3 Salary"+top3Salary);

    }
}
/**
 * Output
 * Employee List
 * [Employee{name='akshay', salary=2000}, Employee{name='varun', salary=1900}, Employee{name='ajay', salary=2100}, Employee{name='nitin', salary=2200}]
 * Top 3 Salary[Employee{name='nitin', salary=2200}, Employee{name='ajay', salary=2100}, Employee{name='akshay', salary=2000}]
 */