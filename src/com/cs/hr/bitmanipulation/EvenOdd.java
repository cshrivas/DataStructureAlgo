package com.cs.hr.bitmanipulation;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(2));
    }

    private static String checkEvenOdd(int i) {
        if((i&1)!=0)
            return "Odd";

        return "Even";
    }
}
