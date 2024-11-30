package com.pradip.set30To40;

import java.util.Arrays;
import java.util.List;

//Find the sum in list
public class Ex32 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = list.stream().mapToInt(x->x).sum();
        System.out.println("List is : "+list);
        System.out.println("Sum is : "+sum);
    }
}
/**
 * Output
 * List is : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Sum is : 55
 */