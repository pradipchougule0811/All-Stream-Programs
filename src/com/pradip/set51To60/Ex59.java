package com.pradip.set51To60;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Reverse each words in the sentence
public class Ex59 {
    public static void main(String[] args) {
        String str ="The greatest glory in living lies not in never falling, but in rising every time we fall";
        List<String> reverse = Arrays.asList(str.split("\\s+"))
                .stream()
                .map(e->new StringBuffer(e).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("String is :"+str);
        System.out.println("Reverse string is :"+reverse);
    }
}
/**
 * output
 * String is :The greatest glory in living lies not in never falling, but in rising every time we fall
 * Reverse string is :[ehT, tsetaerg, yrolg, ni, gnivil, seil, ton, ni, reven, ,gnillaf, tub, ni, gnisir, yreve, emit, ew, llaf]
 */