package com.pradip.set51To60;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Sort a map using keys ( reverse order )
public class Ex53 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("jay",100);
        map.put("aryan",50);
        map.put("ziyan",200);

        Map<String,Integer> map1 =map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a1,a2)->a1,
                        LinkedHashMap::new
                ));
        System.out.println("Map is: "+map);
        System.out.println("Reverse Sorted by Key is: "+map1);
    }
}
/**
 * Output
 * Map is: {jay=100, aryan=50, ziyan=200}
 * Reverse Sorted by Key is: {ziyan=200, jay=100, aryan=50}
 */