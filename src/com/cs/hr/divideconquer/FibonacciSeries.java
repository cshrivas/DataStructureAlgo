package com.cs.hr.divideconquer;

public class FibonacciSeries {


    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(findNFibo(i));
        }
    }


    private static int findNFibo(int n) {
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return findNFibo(n-1) + findNFibo(n-2);
    }
}
