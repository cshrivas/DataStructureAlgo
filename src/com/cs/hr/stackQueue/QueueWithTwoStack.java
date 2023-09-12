package com.cs.hr.stackQueue;

public class QueueWithTwoStack {
    private MyStack<Integer> newStack,outStack;

    public QueueWithTwoStack(){
        this.newStack=new MyStack<>();
        this.outStack=new MyStack<>();
    }

    public void push(int value){
        this.newStack.push(value);
    }

    public Integer pop(){
        if (this.outStack.size()==0){
            while(newStack.size()>0){
                outStack.push(newStack.pop());
            }
        }
        return outStack.pop();
    }
}
