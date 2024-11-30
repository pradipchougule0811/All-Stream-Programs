package com.pradip.set21To30;

import java.util.Arrays;
import java.util.List;

//Collect length of all strings and then sum
public class Ex29 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        Integer sum = list.stream().map(x->x.length())
                .mapToInt(x->x)
                .sum();
        System.out.println("List is : "+list);
        System.out.println("Sum is :"+sum);
    }
}
/**
 * Output
 * List is : [apple, banana, cherry, pineapple]
 * Sum is :26
 */