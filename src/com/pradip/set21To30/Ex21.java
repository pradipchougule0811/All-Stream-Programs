package com.pradip.set21To30;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Partition the list of element into even and odd
public class Ex21 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> map = list.stream()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0));
        System.out.println("List is "+list);
        System.out.println("After Partitioning : "+ map);
    }
}
/**
 * Output
 * List is [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * After Partitioning : {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}
 */