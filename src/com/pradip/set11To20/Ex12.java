package com.pradip.set11To20;

import java.util.Arrays;
import java.util.List;

//Check all elements are positive in list
public class Ex12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(1,2,3,4,-5);

        boolean result1 = list.stream().allMatch(e->e>0);
        boolean result2 = list2.stream().allMatch(e->e>0);

        System.out.println("List 1 : "+list);
        System.out.println("List 2 : "+list2);
        System.out.println("Result 1 : "+result1);
        System.out.println("Result 2 : "+result2);
    }
}
/**
 * Output
 * List 1 : [1, 2, 3, 4, 5]
 * List 2 : [1, 2, 3, 4, -5]
 * Result 1 : true
 * Result 2 : false
 */