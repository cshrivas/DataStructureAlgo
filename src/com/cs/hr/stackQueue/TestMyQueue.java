package com.cs.hr.stackQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue= new MyQueue<>();
        queue.put(1);
        queue.put(2);
        queue.put(3);
        queue.put(4);
        queue.put(5);
        queue.put(6);

        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
