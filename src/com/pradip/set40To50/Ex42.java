package com.pradip.set40To50;
//Find intersection of lists

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex42 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(3,2,5,1);
        List<Integer> intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());

        System.out.println("List 1 : "+list1);
        System.out.println("List 2 : "+list2);
        System.out.println("Intersection of List : "+intersection);
     }
}
/**
 * Output
 * List 1 : [1, 2, 3, 4]
 * List 2 : [3, 2, 5, 1]
 * Intersection of List : [1, 2, 3]
 */