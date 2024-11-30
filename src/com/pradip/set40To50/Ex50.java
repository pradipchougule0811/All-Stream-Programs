package com.pradip.set40To50;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Sort a map using values ( natural order )
public class Ex50 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("jay",100);
        map.put("aryan",50);
        map.put("ziyan",200);

        Map<String,Integer> map2 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new
                ));

        System.out.println("Map is: "+map);
        System.out.println("Sorted by Value is: "+map2);

    }
}
/**
 * Output
 * Map is: {jay=100, aryan=50, ziyan=200}
 * Sorted by Value is: {aryan=50, jay=100, ziyan=200}
 */