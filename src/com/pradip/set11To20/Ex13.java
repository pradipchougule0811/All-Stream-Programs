package com.pradip.set11To20;

import java.util.Arrays;
import java.util.List;

//Check any number greater than 10
public class Ex13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,3,78,3,9,4);
        boolean result = list.stream().anyMatch(e-> e>10);

        System.out.println("List is : "+list);
        System.out.println("Result is : "+result);

        List<Integer> list2 = Arrays.asList(1,2,3,7,8,3,9,4);
        boolean result2 = list2.stream().anyMatch(e-> e>10);

        System.out.println("List2 is : "+list2);
        System.out.println("Result2 is : "+result2);
    }
}
/**
 * Output
 * List is : [12, 3, 78, 3, 9, 4]
 * Result is : true
 * List2 is : [1, 2, 3, 7, 8, 3, 9, 4]
 * Result2 is : false
 */