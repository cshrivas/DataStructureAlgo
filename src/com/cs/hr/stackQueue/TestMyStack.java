package com.cs.hr.stackQueue;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Integer> stack= new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (stack.size()!=0){
            System.out.println(stack.pop());
        }

    }
}
