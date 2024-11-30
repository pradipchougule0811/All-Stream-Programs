package com.pradip.set1To10;
//Fetch all numbers from a list that are greater than 5

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> filtered = list.stream()
                .filter(e-> e>5)
                .collect(Collectors.toList());
        System.out.println("Original List : "+list);
        System.out.println("Result : "+filtered);


    }
}
/**
 * Output
 * Original List : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Result : [6, 7, 8, 9, 10]
 */