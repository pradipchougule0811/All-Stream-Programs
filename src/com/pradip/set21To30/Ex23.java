package com.pradip.set21To30;
//Generate summary statistics of a list ( min,max,avg, count,sum)

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Ex23 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        IntSummaryStatistics summaryStatistics = list.stream()
                .mapToInt(x->x)
                .summaryStatistics();
        System.out.println("List is : "+list);
        System.out.println("Summary : "+summaryStatistics);
    }
}
