package com.pradip.set40To50;

import com.pradip.set11To20.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Convert the Person object into the map having 2 values
public class Ex49 {
    public static void main(String[] args) {
        List<com.pradip.set11To20.Person> personList = new ArrayList<>();
        personList.add(new Person("pradip","jaysingpur"));
        personList.add(new Person("akshay","pune"));
        personList.add(new Person("nitin","pune"));
        personList.add(new Person("rohan","kolhapur"));
        personList.add(new Person("aditi","jaysingpur"));
        personList.add(new Person("avinash","sangli"));

        Map<String, String> map = personList.stream()
                .collect(Collectors.toMap(Person::getName, Person::getCity));
        System.out.println(map);
    }
}
