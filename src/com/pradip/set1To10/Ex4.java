package com.pradip.set1To10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Remove the duplicates from the list and preserve the order
public class Ex4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,1,2,3);

        List<Integer> removeduplicates = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original List : "+list);
        System.out.println("List after removed duplicates : "+removeduplicates);
    }
}
/**
 * Output
 * Original List : [1, 2, 3, 4, 5, 6, 7, 1, 2, 3]
 * List after removed duplicates : [1, 2, 3, 4, 5, 6, 7]
 */