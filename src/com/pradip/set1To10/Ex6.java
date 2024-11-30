package com.pradip.set1To10;
//Print the list of items before converting it to the Uppercase

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        List<String> result = list.stream()
                .peek(e-> System.out.print(e+"  "))
                .map(e->e.toUpperCase())
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("Original List : "+list);
        System.out.println("Result List : "+result);
    }
}
/**
 * Output
 * apple  banana  cherry  pineapple
 * Original List : [apple, banana, cherry, pineapple]
 * Result List : [APPLE, BANANA, CHERRY, PINEAPPLE]
 */