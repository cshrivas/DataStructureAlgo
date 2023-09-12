package com.cs.hr.stackQueue;

public class Problem35 {
    public static void main(String[] args) {
        MyStack<Integer> stack= new MyStack<>();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(6);
        stack.push(2);

        sortStack(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

    private static void sortStack(MyStack<Integer> stack) {
        MyStack<Integer> stackTemp= new MyStack<>();
        int temp;
        while (stack.size()>0){
            temp=stack.pop();
            while (stackTemp.size()>0 && temp<stackTemp.peek()){
                stack.push(stackTemp.pop());
            }
            stackTemp.push(temp);
        }

        while (stackTemp.size()>0){
            stack.push(stackTemp.pop());
        }
    }
}
