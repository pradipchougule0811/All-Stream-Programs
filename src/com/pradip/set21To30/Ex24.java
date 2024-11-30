package com.pradip.set21To30;
//Extract and collect the length of all strings in the list

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex24 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        List<Integer> length = list.stream()
                .map(e->e.length())
                .collect(Collectors.toList());
        System.out.println("List is : "+list);
        System.out.println("Length of all list items are :"+length);
    }
}
/**
 * Output
 * List is : [apple, banana, cherry, pineapple]
 * Length of all list items are :[5, 6, 6, 9]
 */