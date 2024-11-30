package com.pradip.set1To10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Sort the names in the list. (natural order and reverse order )
public class Ex5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rakesh","avinash","akshay","pradip");

        List<String> naturalorder = names.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> reverseorder = names.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Original List : "+names);
        System.out.println("Natural Order List : "+naturalorder);
        System.out.println("Reverse Order List : "+reverseorder);

    }
}
/**
 *Output
 * Original List : [rakesh, avinash, akshay, pradip]
 * Natural Order List : [akshay, avinash, pradip, rakesh]
 * Reverse Order List : [rakesh, pradip, avinash, akshay]
 */