package com.cs.hr.divideconquer;

//Problem Statement: Given N, count the number of ways to express N as a sum of 1,3 and 4
public class NumberFactor {

    public static void main(String[] args) {
        int n=waysToGetN(6);
        System.out.println(n);
    }

    private static int waysToGetN(int i) {
        if(i==0||i==1||i==2)//Base Case {},{1},{1,1}
                return 1;
        if(i==3)
            return 2;//{1,1,1},{3}

        int sub1=waysToGetN(i-1);
        int sub3=waysToGetN(i-3);
        int sub4=waysToGetN(i-4);

        return sub1+sub3+sub4;

    }
}
