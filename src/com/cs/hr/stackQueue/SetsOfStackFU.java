package com.cs.hr.stackQueue;


import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SetsOfStackFU {

    private List<MyStack<Integer>> myStackList;
    private final int MAX_SIZE;

    public SetsOfStackFU(int size){
        this.MAX_SIZE=size;
        this.myStackList= new ArrayList<>();
    }

    public void push(int value){
        if (myStackList.isEmpty()){
            myStackList.add(new MyStack<>());
        }
        int size=myStackList.size();
        MyStack<Integer> stack = myStackList.get(size - 1);
        if(stack.size()==MAX_SIZE){
            MyStack<Integer> newStack= new MyStack<>();
            newStack.push(value);
            myStackList.add(newStack);
        }else{
            stack.push(value);
        }
    }

    public Integer pop(){
        int size=myStackList.size();
        while (size>0 && myStackList.get(size-1).size()==0){
            myStackList.remove(size-1);
            size--;
        }
        if(size==0)
            throw new EmptyStackException();
        MyStack<Integer> stack = myStackList.get(size - 1);
        return stack.pop();
    }

    public Integer popAt(int index){
        int size=myStackList.size();
        while (size>0 && myStackList.get(size-1).size()==0){
            myStackList.remove(size-1);
            size--;
        }
        if(size==0 || size<=index)
            throw new EmptyStackException();
        MyStack<Integer> stack = myStackList.get(index);
        return stack.pop();
    }
}
