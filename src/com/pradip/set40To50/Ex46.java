package com.pradip.set40To50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Convert the map into list of keys and list of values
public class Ex46 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("pradip",200);
        map.put("jay",100);
        map.put("tom",300);
        map.put("jerry",210);
        //Method 1
        List<String> keys1 = new ArrayList<>(map.keySet());
        List<Integer> values1 = new ArrayList<>(map.values());
        System.out.println("Given Map is :\n"+map);
        System.out.println("List of Keys is :\n"+keys1);
        System.out.println("List of Values is :\n"+values1);
        //Method 2
        List<String> keys = map.keySet().stream().collect(Collectors.toList());
        List<Integer> values = map.values().stream().collect(Collectors.toList());
        System.out.println("Given Map is :\n"+map);
        System.out.println("List of Keys is :\n"+keys);
        System.out.println("List of Values is :\n"+values);
    }
}
/**
 * Output
 * Given Map is :
 * {jay=100, tom=300, jerry=210, pradip=200}
 * List of Keys is :
 * [jay, tom, jerry, pradip]
 * List of Values is :
 * [100, 300, 210, 200]
 * Given Map is :
 * {jay=100, tom=300, jerry=210, pradip=200}
 * List of Keys is :
 * [jay, tom, jerry, pradip]
 * List of Values is :
 * [100, 300, 210, 200]
 */
