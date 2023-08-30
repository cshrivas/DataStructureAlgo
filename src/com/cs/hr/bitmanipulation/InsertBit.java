package com.cs.hr.bitmanipulation;

public class InsertBit {
    public static void main(String[] args) {
        int n = insertion(1024,19,2,6);
        System.out.println(n);
        printBinary(n);
    }

    private static void printBinary(int n) {
        String s="";
        while (n>0){
            s=n%2+s;
            n=n/2;
        }
        System.out.println(s);
    }


    private static int insertion(int N, int M, int i, int j) {
        printBinary(N);
        printBinary(M);
        int allOne = ~0;
        int left = allOne << (j+1);
        int right = (1 << i)-1;
        //int right = ~(allOne << i);

        int cleanbit = left | right;
        int mask = N & cleanbit;

        return mask | (M << i);
    }
}
