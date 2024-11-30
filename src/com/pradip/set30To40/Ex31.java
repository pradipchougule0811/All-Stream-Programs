package com.pradip.set30To40;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Convert the list of strings into ConcurrentMap
public class Ex31 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        ConcurrentHashMap<String,Integer> cmap = list.stream()
                .collect(Collectors.toMap(Function.identity(),String::length))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x1,x2)->x1,
                        ConcurrentHashMap::new
                ));
        System.out.println("List is : "+list);
        System.out.println("Concurrent HashMap is : "+cmap);
    }
}
/**
 * Output
 * List is : [apple, banana, cherry, pineapple]
 * Concurrent HashMap is : {banana=6, cherry=6, apple=5, pineapple=9}
 */
