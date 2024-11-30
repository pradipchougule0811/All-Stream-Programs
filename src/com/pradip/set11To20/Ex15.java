package com.pradip.set11To20;

import java.util.Arrays;
import java.util.List;

//Find first element in list starts with "b"
public class Ex15 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        String startswith = list.stream()
                .filter(e->e.startsWith("b"))
                .findFirst()
                .get();
        System.out.println("List is :"+list);
        System.out.println("Result is :"+startswith);
    }
}
/**
 * Output
 * List is :[apple, banana, cherry, pineapple]
 * Result is :banana
 */