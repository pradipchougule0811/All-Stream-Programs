package com.pradip.set11To20;
//Convert list of strings to array of strings

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple");
        String[] str = list.toArray(new String[list.size()]);
        System.out.println("List is: "+list);
        System.out.println("Array Items are :");
        for(String s:str){
            System.out.println(s);
        }
    }
}
/**
 * Output
 * List is: [apple, banana, cherry, pineapple]
 * Array Items are :
 * apple
 * banana
 * cherry
 * pineapple
 */
