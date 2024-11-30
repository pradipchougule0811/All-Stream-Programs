package com.pradip.set30To40;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count the number of occurances  of element in list/sentense
public class Ex33 {
    public static void main(String[] args) {
        //Occurance in the List
        List<String> list = Arrays.asList("apple","banana","cherry","pineapple","apple");
        //Method 1 using normal method
        Map<String,Integer> map1 = new HashMap<>();
        for(String s:list){
            map1.put(s,map1.getOrDefault(s,0)+1);
        }
        System.out.println("List is :"+list);
        System.out.println("Method 1 : "+map1);
        //Method 2 using stream api
        Map<String, Long> map2 = list.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Method 2 : "+map2);

        //Occurance in sentence
        String str="All our dreams can come true, if we have the courage to pursue them";
        Map<String, Long> map3 = Arrays.asList(str.split("\\s+"))
                .stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println("The sentence is : "+str);
        System.out.println("Ocurrences are : "+map3);
    }
}
/**
 * Output
 * List is :[apple, banana, cherry, pineapple, apple]
 * Method 1 : {banana=1, apple=2, cherry=1, pineapple=1}
 * Method 2 : {banana=1, cherry=1, apple=2, pineapple=1}
 * The sentence is : All our dreams can come true, if we have the courage to pursue them
 * Ocurrences are : {All=1, true,=1, them=1, come=1, dreams=1, our=1, courage=1, we=1, the=1, can=1, pursue=1, have=1, to=1, if=1}
 */