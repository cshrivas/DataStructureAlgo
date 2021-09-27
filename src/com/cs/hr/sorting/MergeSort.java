package com.cs.hr.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {40,10,30,80,70,20,60,50,100};
        System.out.println("\n\nPrinting arr befor Sorting...");
        printArray(arr);
        sort(arr, 0, arr.length-1);
        System.out.println("\n\nPrinting arr after Sorting...");
        printArray(arr);
    }

    private static void sort(int[] arr,int startIndex,int endIndex) {
        if(endIndex>startIndex){
            int middleIndex =(startIndex+endIndex)/2;
            sort(arr,startIndex,middleIndex);
            sort(arr,middleIndex+1,endIndex);
            merge(arr,startIndex,middleIndex,endIndex);
        }
    }

    private static void merge(int[] arr, int startIndex, int middleIndex, int endIndex) {
        // Create a new array with length equal to endIndex - startIndex + 1
        int[] arrNew = new int[endIndex-startIndex+1];
        int start1=startIndex;
        int end1=middleIndex;
        int start2=middleIndex+1;
        int end2=endIndex;
        int i = 0;

        //Check and populate smaller first to the new array from
        // array split into two from startIndex to middleIndex and from middleIndex+1 to endIndex
        while (start1<=end1 && start2<=end2){
            if(arr[start1]<arr[start2])
                arrNew[i++]=arr[start1++];
            else
                arrNew[i++]=arr[start2++];
        }

        while (start1<=end1)
            arrNew[i++]=arr[start1++];

        while (start2<=end2)
            arrNew[i++]=arr[start2++];


        for (int j = 0; j < arrNew.length; j++) {
            arr[startIndex]=arrNew[j];
            startIndex++;
        }

    }


    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }
}
