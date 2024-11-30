package com.pradip.set30To40;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Demonstrate difference between skip and limit.
public class Ex36 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> skip = list.stream().skip(3).collect(Collectors.toList());
        List<Integer> limit = list.stream().limit(3).collect(Collectors.toList());

        System.out.println("List is : "+list);
        System.out.println("Skip Demo is : "+skip);
        System.out.println("Limit Demo is : "+limit);
    }
}
/**
 * Output
 * List is : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Skip Demo is : [4, 5, 6, 7, 8, 9, 10]
 * Limit Demo is : [1, 2, 3]
 */