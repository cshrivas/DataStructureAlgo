package com.cs.hr.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {30,10,50,20,60,40};
        printArray(arr);
        sort(arr);
        printArray(arr);
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j] > key ){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1]=key;
            //printArray(arr);
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }
}
