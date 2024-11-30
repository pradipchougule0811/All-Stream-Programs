package com.pradip.set21To30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Concat all strings from the list with comma, suffix and prefix
public class Ex25 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        String str = list.stream()
                .collect(Collectors.joining(", "," { "," }"));
        System.out.println("List is : "+list);
        System.out.println("Complete string is :"+str);
    }
}
/**
 * Output
 * List is : [apple, banana, cherry, pineapple]
 * Complete string is : { apple, banana, cherry, pineapple }
 */