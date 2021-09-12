package com.cs.hr.tree;

public class FindElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        int higgest=Integer.MIN_VALUE;
        int a=findBiggest(arr,9,higgest);
        System.out.println(a);
    }

    private static int findBiggest(int[] arr, int n,int higgest) {
        if(n==-1){
            return higgest;
        }else{
            if(arr[n]>higgest)
                higgest=arr[n];
        }
        return findBiggest(arr,n-1,higgest);
    }
}
