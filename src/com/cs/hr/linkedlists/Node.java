package com.cs.hr.linkedlists;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(next, node.next) && Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, data);
    }
}
