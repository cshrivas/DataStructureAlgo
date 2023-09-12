package com.cs.hr.linkedlists;

public class Problem28 {
    public static void main(String[] args) {
        Node<Integer> list1 = new Node(3);
        list1.appendToTail(1);
        list1.appendToTail(5);
        list1.appendToTail(9);
        list1.appendToTail(7);
        list1.appendToTail(2);
        list1.appendToTail(1);
        list1.appendToTail(11);
        list1.appendToTail(8);
        list1.appendToTail(13);
        list1.appendToTail(4);

        Node<Integer> head=list1;
        while (head.next!=null){
            head=head.next;
        }
        head.next=list1.next.next.next;

        Node<Integer> beginningNode= findCircularNode(list1);
        System.out.println(beginningNode);
    }

    private static Node<Integer> findCircularNode(Node<Integer> list1) {
        Node<Integer> faster= list1;
        Node<Integer> slow= list1;

        while (faster!=null && faster.next!=null){
            faster=faster.next.next;
            slow=slow.next;
            if(faster==slow){
                break;
            }
        }

        if (faster==null || faster.next==null){
            return null;
        }

        slow=list1;

        while (slow!=faster){
            slow=slow.next;
            faster=faster.next;
        }
        return faster;
    }
}
