package com.cs.hr.linkedlists;

public class Problem23 {
    public static void main(String[] args) {
        Node<String> head = new Node("a");
        head.appendToTail("b");
        head.appendToTail("c");
        head.appendToTail("d");
        head.appendToTail("e");
        head.appendToTail("f");
        //head.appendToTail("g");
        head.printLinkedList();
        head = deleteMiddleNode(head);
        head.printLinkedList();
        head = reverseLinkedList(head);
        head.printLinkedList();
        
    }

    private static Node<String> reverseLinkedList(Node<String> head) {
        Node<String> t1=head;
        Node<String> t2 = head;
        head = null;
        while (t1!=null){
            t1=t1.next;
            t2.next = head;
            head=t2;
            t2=t1;
        }
        return head;
    }

    private static Node<String> deleteMiddleNode(Node<String> head) {
        if(head == null)
            return null;

        Node<String> slow = head;
        Node<String> fast = head;
        Node<String> previous=null;
        while (fast.next!=null){
            if(fast.next.next == null) {
                System.out.println("even");
                break;
            }
            fast = fast.next.next;
            previous=slow;
            slow = slow.next;
        }
        if(previous!=null)
            previous.next=slow.next;
        return head;
    }
}
