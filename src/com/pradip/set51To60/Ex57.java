package com.pradip.set51To60;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Check the list is sorted or not
public class Ex57 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        boolean b = IntStream.range(0, list.size()).allMatch(e -> list.get(e) > list.get(e + 1));

        System.out.println("List 1 : "+list);
        System.out.println("Is list is sorted : "+b);

        List<Integer> list1 = Arrays.asList(1,2,10,4,5,6);
        boolean b1 = IntStream.range(0, list.size()).allMatch(e -> list.get(e) > list.get(e + 1));

        System.out.println("List 1 : "+list1);
        System.out.println("Is list is sorted : "+b1);
    }
}
/**
 * Output
 *  List 1 : [1, 2, 3, 4, 5, 6]
 * Is list is sorted : false
 * List 1 : [1, 2, 10, 4, 5, 6]
 * Is list is sorted : false
 */