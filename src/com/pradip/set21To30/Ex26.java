package com.pradip.set21To30;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group the list of strings by their length and count the number of strings in each group.
public class Ex26 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println("List is : "+list);
        System.out.println("Result is :"+map);
    }
}
/**
 * Output
 * List is : [apple, banana, cherry, pineapple]
 * Result is :{5=1, 6=2, 9=1}
 */