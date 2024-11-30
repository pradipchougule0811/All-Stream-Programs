package com.pradip.set51To60;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Merge two sorted list into one
public class Ex60 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(11,21,31,41,51);
        List<Integer> merged = Stream.concat(l1.stream(), l2.stream()).sorted().collect(Collectors.toList());
        System.out.println(" List 1 :"+l1);
        System.out.println(" List 1 :"+l2);
        System.out.println(" Merged List :"+merged);
    }
}
/**
 * Output
 *  List 1 :[1, 2, 3, 4, 5]
 *  List 1 :[11, 21, 31, 41, 51]
 *  Merged List :[1, 2, 3, 4, 5, 11, 21, 31, 41, 51]
 */