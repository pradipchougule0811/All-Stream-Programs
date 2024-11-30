package com.pradip.set40To50;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count frequency of words in sentense
public class Ex43 {
    public static void main(String[] args) {
        String str="the future belongs to those who believe in the beauty of their dreams";
        Map<String,Long> map = Arrays.asList(str.split("\\s+"))
                .stream()
                .collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting())
                );

        System.out.println("The sentence : "+str);
        System.out.println("Frequency of each words : \n"+map);
    }
}
/**
 * Output
 * The sentence : the future belongs to those who believe in the beauty of their dreams
 * Frequency of each words :
 * {the=2, beauty=1, in=1, belongs=1, future=1, of=1, their=1, dreams=1, believe=1, to=1, those=1, who=1}
 */