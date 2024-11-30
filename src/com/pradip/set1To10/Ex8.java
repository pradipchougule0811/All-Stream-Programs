package com.pradip.set1To10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Skip first 3 elements from list
public class Ex8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rakesh","avinash","akshay","pradip");
        List<String> getThree = names.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("Original List : "+names);
        System.out.println("Result List : "+getThree);
    }
}
/**
 * Output
 * Original List : [rakesh, avinash, akshay, pradip]
 * Result List : [pradip]
 */