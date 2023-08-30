package com.cs.hr.linkedlists;

public class Problem21 {
    public static void main(String[] args) {
        Node<Integer> head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(1);
        head.appendToTail(8);
        head.appendToTail(8);
        head.printLinkedList();
        head = getUniqueList(head);
        head.printLinkedList();
    }

    private static Node getUniqueList(Node head) {
        if(head==null)
            return null;

        Node<Integer> n = head;
        int checker =0;
        checker |= (1<<n.data);
        while (n.next!=null){
            int val = (int)n.next.data;
            if((checker & (1<<val))>0){
                if(n.next.next!=null)
                    n.next = n.next.next;
                else{
                    n.next=null;
                    break;
                }
            }else{
                checker |= (1<<val);
                n=n.next;
            }

        }
        return head;
    }


}
