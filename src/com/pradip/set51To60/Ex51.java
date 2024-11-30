package com.pradip.set51To60;
//Sort a map using values ( reverse order )
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex51 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("jay",100);
        map.put("aryan",50);
        map.put("ziyan",200);

        Map<String,Integer> map2 = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new
                ));

        System.out.println("Map is: "+map);
        System.out.println("Reverse Sorted by Value is: "+map2);
    }
}
/**
 * Output
 * Map is: {jay=100, aryan=50, ziyan=200}
 * Sorted by Value is: {ziyan=200, jay=100, aryan=50}
 */