package com.pradip.set21To30;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Convert stream into set and get the size
public class Ex28 {
    public static void main(String[] args) {
        long count = Stream.of(1, 2, 3, 4, 2, 4).collect(Collectors.toSet()).stream().count();
        System.out.println("Count is : "+count);
    }
}
/**
 * Output
 * Count is : 4
 */