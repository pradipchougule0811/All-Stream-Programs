package com.pradip.set30To40;
//Write a program to multiply two numbers using Functional Interface
@FunctionalInterface
interface Demo{
    public int multiply(int a,int b);
}
public class Ex35 {
    public static void main(String[] args) {
        Demo d = (a,b)-> a*b;
        int x=5,y=10;
        System.out.println("Multiplication of numbers is : "+d.multiply(x,y));
    }
}
/**
 * Output
 * Multiplication of numbers is : 50
 */