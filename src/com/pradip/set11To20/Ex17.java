package com.pradip.set11To20;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

//Find min, max value from list
public class Ex17 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int min = list.stream().mapToInt(e->e).min().getAsInt();
        int max =list.stream().mapToInt(e->e).max().getAsInt();
        System.out.println("List is: "+list);
        System.out.println("Minimum is :"+min);
        System.out.println("Maximum is :"+max);
    }
}
/**
 * Output
 * List is: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Minimum is :1
 * Maximum is :10
 */