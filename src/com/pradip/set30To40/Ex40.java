package com.pradip.set30To40;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Group by all employee with age/salary
public class Ex40 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("akshay",2000));
        emp.add(new Employee("varun",1900));
        emp.add(new Employee("ajay",2100));
        emp.add(new Employee("nitin",2200));
        emp.add(new Employee("rohan",2200));

        Map<Integer,List<String>> group =
                emp.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Employee::getSalary,
                                        Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println("Employee List");
        System.out.println(emp);
        System.out.println("Group By Salary: \n"+group);
    }
}
/**
 * output
 * Employee List
 * [Employee{name='akshay', salary=2000}, Employee{name='varun', salary=1900}, Employee{name='ajay', salary=2100}, Employee{name='nitin', salary=2200}, Employee{name='rohan', salary=2200}]
 * Group By Salary:
 * {2000=[akshay], 2100=[ajay], 2200=[nitin, rohan], 1900=[varun]}
 */