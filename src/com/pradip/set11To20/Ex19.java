package com.pradip.set11To20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Concate all strings in list with " , "
public class Ex19 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        String str = list.stream().collect(Collectors.joining(", "));

        System.out.println("List is "+list);
        System.out.println("After Joining String is : "+str);
    }
}
/**
 * Output
 * List is [apple, banana, cherry, pineapple]
 * After Joining String is : apple, banana, cherry, pineapple
 */