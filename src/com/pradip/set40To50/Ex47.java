package com.pradip.set40To50;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter the list based on prefix and length
public class Ex47 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple","banana");
        List<String> filterd = list.stream()
                .filter(x->(x.startsWith("b") && x.length()>3))
                .collect(Collectors.toList());

        System.out.println("List is :"+list);
        System.out.println("Filtered list is :"+filterd);
    }
}
/**
 * Output
 * List is :[apple, banana, cherry, pineapple, banana]
 * Filtered list is :[banana, banana]
 */