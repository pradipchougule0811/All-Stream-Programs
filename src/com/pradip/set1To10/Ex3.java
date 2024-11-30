package com.pradip.set1To10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//Flaten the two given list of integers
public class Ex3 {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1,2,3,4,5),
                Arrays.asList(6,7,8,9,10)
        );
        //Method 1
        List<Integer> method1 = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        //Method 2
        List<Integer> method2 = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("Original List : "+list);
        System.out.println("Method 1 List : "+method1);
        System.out.println("Method 2 List : "+method2);
    }
}
/**
 * Output:
 * Original List : [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]]
 * Method 1 List : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Method 2 List : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */