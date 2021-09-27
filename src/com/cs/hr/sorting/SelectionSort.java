package com.cs.hr.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {30,10,50,20,60,40};
        printArray(arr);
        sort(arr);
        printArray(arr);
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minInd=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minInd]>arr[j]){
                    minInd=j;
                }
            }

            if(minInd!=i){
                arr[minInd]=arr[minInd]+arr[i];
                arr[i]=arr[minInd]-arr[i];
                arr[minInd]=arr[minInd]-arr[i];
            }

        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }

}
