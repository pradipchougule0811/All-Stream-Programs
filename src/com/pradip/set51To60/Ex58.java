package com.pradip.set51To60;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

//Find the factorial of a number
public class Ex58 {
    public static void main(String[] args) {
        int num = 5;
        int factorial = IntStream.rangeClosed(1, num)
                .reduce(1, ( a, b) -> a * b);
        System.out.println("Factorial of num "+num+ " is "+factorial);
    }
}
/**
 * Output
 * Factorial of num 5 is 120
 */