package com.pradip.set40To50;

import java.util.Arrays;
import java.util.Comparator;


//Find the longest word in the string
public class Ex48 {
    public static void main(String[] args) {
        String str="If you set your goals ridiculously high and it's a failure, " +
                "you will fail above everyone else's success";
        String lonestword = Arrays.asList(str.split("\\s+"))
                .stream()
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println("Sentence : \n"+str);
        System.out.println("Longest word is : \n"+lonestword);
    }
}
/**
 * output
 * Sentence :
 * If you set your goals ridiculously high and it's a failure, you will fail above everyone else's success
 * Longest word is :
 * ridiculously
 */