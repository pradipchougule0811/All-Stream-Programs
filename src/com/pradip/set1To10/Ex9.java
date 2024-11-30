package com.pradip.set1To10;
//Print each element of the list with some prefix

import java.util.Arrays;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rakesh","avinash","akshay","pradip");
        System.out.println("Original List : "+names);
        System.out.println("Results are : ");
        names.stream()
                .forEach(e-> System.out.println(" Hello "+e));
    }
}
/**
 * Output
 * Original List : [rakesh, avinash, akshay, pradip]
 * Results are :
 *  Hello rakesh
 *  Hello avinash
 *  Hello akshay
 *  Hello pradip
 */