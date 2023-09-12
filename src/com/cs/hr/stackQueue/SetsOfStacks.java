package com.cs.hr.stackQueue;

public class SetsOfStacks {

    private MyStack<MyStack<Integer>> myStack;
    private int MAX_SIZE;

    public SetsOfStacks(int size){
        this.MAX_SIZE=size;
        this.myStack=new MyStack<>();

    }

    public void push(int value){

        if(myStack.size()==0){
            MyStack<Integer> newStack= new MyStack<>();
            myStack.push(newStack);
        }
        MyStack<Integer> peek = myStack.peek();
        if (peek.size()==MAX_SIZE){
            MyStack<Integer> newStack= new MyStack<>();
            newStack.push(value);
            myStack.push(newStack);
        }else {
            peek.push(value);
        }
    }

    public Integer pop(){
        MyStack<Integer> peek= myStack.peek();
        while (myStack.peek()!=null && myStack.peek().size()==0){
            myStack.pop();
        }
        return myStack.peek().pop();
    }
}
