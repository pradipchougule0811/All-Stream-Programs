package com.pradip.set40To50;

import java.util.Arrays;
import java.util.List;

//Find the sum of squares in the list
public class Ex45 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = list.stream()
                .mapToInt(x->x*x)
                .sum();

        System.out.println("List is : "+list);
        System.out.println("Sum of product is : "+sum);
    }
}
/**
 * output
 * List is : [1, 2, 3, 4, 5]
 * Sum of product is : 55
 */