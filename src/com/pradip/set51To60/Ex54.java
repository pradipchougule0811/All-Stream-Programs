package com.pradip.set51To60;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find the first non repeating character from string
public class Ex54 {
    public static void main(String[] args) {
        String str="google";
        List<String> list = Arrays.asList(str.split(""));
        System.out.println(list);
        //Using Stream API
        Map.Entry<String,Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .findFirst()
                .get();
        System.out.println("First using steam API Non-repeating char : "+map.getKey());

        //Using normal Method
        Map<Character,Integer> map2 = new LinkedHashMap<>();
        for(Character c:str.toCharArray())
            map2.put(c,map2.getOrDefault(c,0)+1);
        System.out.println(map2);
        for(Map.Entry<Character,Integer> em : map2.entrySet()){
            if(em.getValue()==1)
            {
                System.out.println("First non repeating Character is : "+em.getKey());
                break;
            }

        }
    }
}
/**
 * Output
 * [g, o, o, g, l, e]
 * First using steam API Non-repeating char : l
 * {g=2, o=2, l=1, e=1}
 * First non repeating Character is : l
 */