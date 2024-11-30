package com.pradip.set1To10;
//Transform a list of Strings into Upper case

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        //Method 1
        List<String> trnsform = list.stream()
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());

        //Method 2
        List<String> trnsform2 = list.stream()
                .map(e-> new StringBuilder(e).toString().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Original String : "+list);
        System.out.println("Method 1 Result : "+trnsform);
        System.out.println("Method 2 Result : "+trnsform2);

    }
}
/**
 * Output
 * Original String : [apple, banana, cherry, pineapple]
 * Method 1 Result : [APPLE, BANANA, CHERRY, PINEAPPLE]
 * Method 2 Result : [APPLE, BANANA, CHERRY, PINEAPPLE]
 */