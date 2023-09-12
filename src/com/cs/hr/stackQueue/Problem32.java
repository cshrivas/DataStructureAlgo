package com.cs.hr.stackQueue;

public class Problem32 {
    public static void main(String[] args) {
        StackWithMin stack= new StackWithMin();
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(1);
//        System.out.println("pop: "+stack.pop());
        System.out.println("min: "+stack.min());
        System.out.println("pop: "+stack.pop());
        System.out.println("min: "+stack.min());
        System.out.println("pop: "+stack.pop());
        System.out.println("min: "+stack.min());
        System.out.println("pop: "+stack.pop());
        System.out.println("min: "+stack.min());
        System.out.println("pop: "+stack.pop());
        System.out.println("min: "+stack.min());
//        System.out.println(stack.pop());
//        System.out.println(stack.min());
    }
}
