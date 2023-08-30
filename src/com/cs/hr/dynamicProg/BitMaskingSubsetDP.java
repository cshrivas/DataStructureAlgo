package com.cs.hr.dynamicProg;

public class BitMaskingSubsetDP {
    public static void main(String[] args) {
        int subset = 27;
        display(subset);
        subset=remove(subset , 5);
        display(subset);
        subset=add(subset,6);
        display(subset);
    }

    private static int remove(int subset, int x) {
        subset = subset ^ (1 << (x-1));
        return subset;
    }

    private static int add(int subset, int x) {
        subset = subset ^ (1 << (x-1));
        return subset;
    }

    private static void display(int subset) {
        for (int i = 0; i < 10; i++) {
            if((subset & (1<<i)) != 0){
                System.out.print((i+1) + " ");
            }
        }
        System.out.println();
    }
}
