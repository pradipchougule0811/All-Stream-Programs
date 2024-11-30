package com.pradip.set11To20;
//Calculate product of each elements in the list

import java.util.Arrays;
import java.util.List;


public class Ex11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Integer product = list.stream()
                .reduce(1,(i,j)->{return i*j;});
        System.out.println("Original List is : "+list);
        System.out.println("Result is : "+product);
    }
}
/**
 * Output
 * Original List is : [1, 2, 3, 4, 5]
 * Result is : 120
 */
