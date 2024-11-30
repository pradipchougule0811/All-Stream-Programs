package com.pradip.set11To20;
//Group the people by City

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex20 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("pradip","jaysingpur"));
        personList.add(new Person("akshay","pune"));
        personList.add(new Person("nitin","pune"));
        personList.add(new Person("rohan","kolhapur"));
        personList.add(new Person("aditi","jaysingpur"));
        personList.add(new Person("avinash","sangli"));

        Map<String,List<Person>> map = personList.stream()
                .collect(Collectors.groupingBy(Person::getCity));
        System.out.println("Display group by city all objects:");
        System.out.println(map);
        Map<String, List<String>> map1 = personList.stream()
                .collect(Collectors
                        .groupingBy(
                                Person::getCity,
                                Collectors.mapping(Person::getName, Collectors.toList())));

        System.out.println("Display group by city only names of Person:");
        System.out.println(map1);

    }
}
/**
 * Outpur
 * Display group by city all objects:
 * {jaysingpur=[Person{name='pradip', city='jaysingpur'}, Person{name='aditi', city='jaysingpur'}],
 * sangli=[Person{name='avinash', city='sangli'}],
 * kolhapur=[Person{name='rohan', city='kolhapur'}],
 * pune=[Person{name='akshay', city='pune'}, Person{name='nitin', city='pune'}]}
 * Display group by city only names of Person:
 * {jaysingpur=[pradip, aditi], sangli=[avinash], kolhapur=[rohan], pune=[akshay, nitin]}
 */