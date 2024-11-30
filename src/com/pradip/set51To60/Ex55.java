package com.pradip.set51To60;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort list of strings based on length
public class Ex55 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","cherry","pineapple","banana");

        List<String> sorted = list.stream().sorted()
                .collect(Collectors.toList());
        System.out.println("List is "+list);
        System.out.println("Sorted list based on length is : "+sorted);

        List<String> reverse = list.stream().sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("List is "+list);
        System.out.println("Reverse Sorted list based on length is : "+reverse);
    }
}
/**
 * Output
 * List is [apple, cherry, pineapple, banana]
 * Sorted list based on length is : [apple, banana, cherry, pineapple]
 * List is [apple, cherry, pineapple, banana]
 * Reverse Sorted list based on length is : [pineapple, cherry, banana, apple]
 */