package com.pradip.set21To30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter and collect all the even numbers from list
public class Ex27 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        List<Integer> odd = list.stream().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println("List is : "+list);
        System.out.println("Even numbers are : "+even);
        System.out.println("Odd numbers are : "+odd);
    }
}
/**
 * Output
 *List is : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Even numbers are : [2, 4, 6, 8, 10]
 * Odd numbers are : [1, 3, 5, 7, 9]
 */