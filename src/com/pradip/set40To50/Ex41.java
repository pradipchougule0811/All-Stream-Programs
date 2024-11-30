package com.pradip.set40To50;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Find second smallest element from list
public class Ex41 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Mehtod 1 Normat Method
        System.out.println("List : "+list);
        Collections.sort(list);
        System.out.println("Second smallest Method 1: "+list.get(1));
        //Method 2
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int smallest = list.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println("List : "+list1);
        System.out.println("Second smallest Method 2: "+smallest);
    }
}
/**
 * Output
 * List : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Second smallest Method 1: 2
 * List : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Second smallest Method 2: 2
 */