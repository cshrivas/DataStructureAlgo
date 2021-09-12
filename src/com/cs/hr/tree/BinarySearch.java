package com.cs.hr.tree;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int n=10;
        System.out.println(binarySearch(arr,n,0,18));
    }

    private static boolean binarySearch(int[] arr, int n, int i, int j) {
        if(i==j){
            return arr[i] == n;
        }
        int mid=(i+j)/2;
        if(arr[mid]==n){
            return true;
        }else if(arr[mid]>n){
            return binarySearch(arr,n,i,mid-1);
        }else{
            return binarySearch(arr,n,mid+1,j);
        }
    }
}
