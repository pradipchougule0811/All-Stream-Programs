package com.pradip.set21To30;

import java.util.Arrays;
import java.util.List;

//count the number of strings in the list
public class Ex22 {
    public static void main(String[] args) {
        List<String> list  = Arrays.asList("apple","banana","cherry","pineapple");
        //Method 1 (Simple)
        System.out.println("List is : "+list);
        System.out.println("Method 1 : "+list.size());

        //Method 2
        long count = list.stream().count();
        System.out.println("Method 2 : "+count);
    }
}
