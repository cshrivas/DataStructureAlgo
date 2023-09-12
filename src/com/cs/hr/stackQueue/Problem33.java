package com.cs.hr.stackQueue;

public class Problem33 {
    public static void main(String[] args) {
        SetsOfStackFU sets= new SetsOfStackFU(3);
        sets.push(1);
        sets.push(2);
        sets.push(3);
        sets.push(4);
        sets.push(5);
        sets.push(6);
        sets.push(7);
        sets.push(8);
        sets.push(9);
        sets.push(10);
        System.out.println(sets.popAt(4));

    }
}
