package com.pradip.set30To40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given list of Employee, sort based on salary in natural and reverse order.
public class Ex37 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("akshay",2000));
        emp.add(new Employee("varun",1900));
        emp.add(new Employee("ajay",2100));
        emp.add(new Employee("nitin",2200));

        List<Employee> s = emp.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println("Natural Order Sorting");
        System.out.println(s);

        List<Employee> s1 = emp.stream()
                .sorted((a1,a2)-> Integer.compare(a2.getSalary(), a1.getSalary()))
                .collect(Collectors.toList());
        System.out.println("Reverse Order Sorting");
        System.out.println(s1);

    }
}
/**
 * Output
 * Natural Order Sorting
 * [Employee{name='varun', salary=1900}, Employee{name='akshay', salary=2000}, Employee{name='ajay', salary=2100}, Employee{name='nitin', salary=2200}]
 * Reverse Order Sorting
 * [Employee{name='nitin', salary=2200}, Employee{name='ajay', salary=2100}, Employee{name='akshay', salary=2000}, Employee{name='varun', salary=1900}]
 */