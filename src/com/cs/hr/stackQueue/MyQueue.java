package com.cs.hr.stackQueue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data=data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void put(T data){
        QueueNode<T> queueNode= new QueueNode<>(data);
        if(first==null){
            first=queueNode;
        }else {
            last.next = queueNode;
        }
        last=queueNode;
    }

    public T remove(){
        if (first==null)
            throw new NoSuchElementException();
        T data= first.data;
        first=first.next;
        return data;
    }

    public T peekFirst(){
        if (first==null)
            throw new NoSuchElementException();
        T data= first.data;
        return data;
    }

    public T peekLast(){
        if (last==null)
            throw new NoSuchElementException();
        T data= last.data;
        return data;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        int count=0;
        QueueNode<T> queueNode=first;
        while (queueNode!=null){
            queueNode=queueNode.next;
            count++;
        }
        return count;
    }

}
