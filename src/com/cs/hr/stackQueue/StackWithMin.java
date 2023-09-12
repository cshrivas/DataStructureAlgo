package com.cs.hr.stackQueue;

import java.util.EmptyStackException;

public class StackWithMin extends MyStack<Integer>{

    MyStack<Integer> s2=new MyStack<>();

    public void push(int value){
        if(s2.size()==0)
            s2.push(value);
        else {
            if(value<=s2.peek()){
                s2.push(value);
            }
        }
        super.push(value);
    }

    public Integer pop(){
        Integer pop = super.pop();
        if(pop==s2.peek()){
            s2.pop();
        }
        return pop;
    }

    public Integer peek(){
        return super.peek();
    }

    public Integer min(){
        if(s2.size()==0)
            throw new EmptyStackException();
        return s2.peek();
    }

    @Override
    public String toString() {
        return "StackWithMin{" +
                "s2=" + s2 +
                '}';
    }
}
