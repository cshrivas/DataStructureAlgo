package com.cs.hr.stackQueue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Problem31 {

    private int[] stack;
    public int[] sizes;
    private int stackCapacity;

    public Problem31(int size){
        this.stack= new int[3*size];
        this.sizes= new int[size];
        stackCapacity=size;
    }
    public void push(int stackNo,int value){
        if (sizes[stackNo-1]==stackCapacity)
            throw new StackOverflowError();
        stack[((stackNo-1)*(3))+sizes[stackNo-1]]=value;
        sizes[stackNo-1]++;
    }

    public int pop(int stackNo){
        if (sizes[stackNo-1]==0)
            throw new EmptyStackException();
        int data = stack[((stackNo-1)*(3))+sizes[stackNo-1]-1];
        sizes[stackNo-1]--;
        return data;
    }

    public int peek(int stackNo){
        if (sizes[stackNo-1]==0)
            throw new EmptyStackException();
        int data = stack[((stackNo-1)*(3))+sizes[stackNo-1]-1];
        return data;
    }

    public static void main(String[] args) {
        Problem31 problem31= new Problem31(3);
        problem31.push(1,1);
        problem31.push(1,2);
        problem31.push(1,3);
        problem31.push(2,1);
        problem31.push(2,2);
        problem31.push(2,3);
        problem31.push(3,1);
        problem31.push(3,2);
        problem31.push(3,3);
        System.out.println(problem31);
        System.out.println(problem31.peek(1));
        System.out.println(problem31.peek(2));
        System.out.println(problem31.peek(3));
        System.out.println(problem31.pop(1));
        System.out.println(problem31.pop(2));
        System.out.println(problem31.pop(3));
        System.out.println(problem31.pop(1));
        System.out.println(problem31.pop(2));
        System.out.println(problem31.pop(3));
        System.out.println(problem31.pop(1));
        System.out.println(problem31.pop(2));
        System.out.println(problem31.pop(3));
        System.out.println(problem31);
    }

    @Override
    public String toString() {
        return "Problem31{" +
                "stack=" + Arrays.toString(stack) +
                ", sizes=" + Arrays.toString(sizes) +
                ", stackCapacity=" + stackCapacity +
                '}';
    }
}
