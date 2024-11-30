package com.pradip.set1To10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Collect list of integers into set
public class Ex10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,5);
        //Method 1
        Set<Integer> set1 = new HashSet<>(list);

        //Method 2
        Set<Integer> set2 = list.stream().collect(Collectors.toSet());

        System.out.println("Original List : "+list);
        System.out.println("Convert Method 1  : "+set1);
        System.out.println("Convert Method 2  : "+set2);

    }
}
/**
 * Output
 * Original List : [1, 2, 2, 3, 4, 5, 5]
 * Convert Method 1  : [1, 2, 3, 4, 5]
 * Convert Method 2  : [1, 2, 3, 4, 5]
 */