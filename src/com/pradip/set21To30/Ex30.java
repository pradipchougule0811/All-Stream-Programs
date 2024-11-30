package com.pradip.set21To30;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Convert the list of strings into Map
public class Ex30 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        Map<String,Integer> map = list.stream().collect(
                Collectors.toMap(Function.identity(),String::length)
        );
        System.out.println("List is : "+list);
        System.out.println("Map is : "+map);
    }
}
/**
 * Output
 * List is : [apple, banana, cherry, pineapple]
 * Map is : {banana=6, cherry=6, apple=5, pineapple=9}
 */