package com.pradip.set40To50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Remove the duplicates from the list.
public class Ex44 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,5,6);
        //Method 1 which preserv the order of elements
        List<Integer> one = list.stream().distinct().collect(Collectors.toList());
        //Method 2 Order may be vary based on hash value
        Set<Integer> set = new HashSet<>(list);

        //Method 3
        Set<Integer> set1 = list.stream().collect(Collectors.toSet());

        System.out.println("List is : "+list);
        System.out.println("Method 1 : "+one);
        System.out.println("Method 2 : "+set);
        System.out.println("Method 3 : "+set1);
    }
}
/**
 * Output
 * List is : [1, 2, 2, 3, 4, 5, 5, 6]
 * Method 1 : [1, 2, 3, 4, 5, 6]
 * Method 2 : [1, 2, 3, 4, 5, 6]
 * Method 3 : [1, 2, 3, 4, 5, 6]
 */