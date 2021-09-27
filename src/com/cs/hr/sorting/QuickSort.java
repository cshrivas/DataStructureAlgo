package com.cs.hr.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,4,6,3,7,1,2,11,5};
        System.out.println("\n\nPrinting arr before Sorting...");
        printArray(arr);
        sort(arr, 0, arr.length-1);
        System.out.println("\n\nPrinting arr after Sorting...");
        printArray(arr);
    }

    private static void sort(int[] arr, int startIndex, int endIndex) {
        if(startIndex<endIndex){
            int partitionIndex = partition(arr,startIndex,endIndex);
            sort(arr, startIndex, partitionIndex-1);
            sort(arr, partitionIndex+1, endIndex);
        }
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        int pivot=endIndex;
        int i=startIndex;
        for (int j = startIndex+1; j <= endIndex; j++) {
            if(arr[j]<=arr[pivot]){
                arr[j]=arr[i]+arr[j];
                arr[i]=arr[j]-arr[i];
                arr[j]=arr[j]-arr[i];
                i++;
            }
        }
        return i-1;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }
}
