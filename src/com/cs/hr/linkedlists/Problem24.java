package com.cs.hr.linkedlists;

public class Problem24 {
    public static void main(String[] args) {
        Node<Integer> head = new Node(1);
        head.appendToTail(6);
        head.appendToTail(2);
        head.appendToTail(8);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(7);
        head.appendToTail(5);
        head.printLinkedList();
        Node<Integer> result = partitionNth(head, 5);
        result.printLinkedList();
        Node<Integer> reverseList = reverseList(result);
        reverseList.printLinkedList();
    }

    private static Node<Integer> reverseList(Node<Integer> node) {
        Node<Integer> head=node;
        Node<Integer> tail=node;
        while (node!=null){
            Node next = node.next;
            node.next=head;
            head=node;
            node=next;
        }
        tail.next=null;
        return head;
    }

    private static Node<Integer> partitionNth(Node<Integer> node, int i) {
        Node<Integer> head=node;
        Node<Integer> tail=node;
        //node=node.next;
        while (node!=null){
            Node next = node.next;
            if(node.data<i){
                node.next=head;
                head=node;
            }else {
                tail.next=node;
                tail=node;
            }
            tail.next=null;
            node=next;
        }
        return head;
    }


}
