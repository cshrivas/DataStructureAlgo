package com.cs.hr.linkedlists;

public class Node<T>{
    Node next = null;
    T data;
    public Node(){
    }
    public Node(T data){
        this.data=data;
    }

    void appendToTail(T d){
        Node end = new Node(d);
        Node n = this;
        while (n.next!= null){
            n=n.next;
        }
        n.next=end;
    }

    void printLinkedList() {
        Node n = this;
        while (n.next!=null){
            System.out.print(n.data + " -> ");
            n=n.next;
        }
        System.out.println(n.data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
