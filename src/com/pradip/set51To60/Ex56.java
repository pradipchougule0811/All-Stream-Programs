package com.pradip.set51To60;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find most frequent word from sentence
public class Ex56 {
    public static void main(String[] args) {
        String str="The way to get started is to quit talking and begin doing";
        String mostFrequent = Arrays.asList(str.split("\\s+"))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();
        System.out.println("Given Sting is : "+str);
        System.out.println("Most frequent word is : "+mostFrequent);
    }
}
