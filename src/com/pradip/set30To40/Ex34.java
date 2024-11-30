package com.pradip.set30To40;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the duplicates
public class Ex34 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,2,3,3,4,5,6);
        System.out.println("List is :"+list);
        //Method 1
        Set<Integer> s = new HashSet<>();
        Set<Integer> set = list.stream().filter(x->s.add(x)==false).collect(Collectors.toSet());
        System.out.println("Method 1 : "+set);
        //Method 2
        Set<Integer> set1 = list.stream().collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .map(x->x.getKey())
                .collect(Collectors.toSet());
        System.out.println("Method 2: "+set1);
    }
}
/**
 * Output
 * List is :[1, 1, 2, 2, 3, 3, 4, 5, 6]
 * Method 1 : [1, 2, 3]
 * Method 2: [1, 2, 3]
 */