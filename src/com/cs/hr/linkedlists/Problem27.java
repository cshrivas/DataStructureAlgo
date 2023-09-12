package com.cs.hr.linkedlists;

public class Problem27 {
    public static void main(String[] args) {
        Node<Integer> list1 = new Node(3);
        list1.appendToTail(1);
        list1.appendToTail(5);
        list1.appendToTail(9);
        list1.appendToTail(7);
        list1.appendToTail(2);
        list1.appendToTail(1);
        list1.printLinkedList();
        Node<Integer> list2 = new Node(4);
        list2.appendToTail(6);
        list2.next.next=list1.next.next.next.next;
        list2.printLinkedList();
        Node<Integer> intersectNode=findIntersection(list1,list2);
        System.out.println(intersectNode);




    }

    private static Node<Integer> findIntersection(Node<Integer> list1, Node<Integer> list2) {
        Node<Integer> lastNode1= fetchLastElement(list1);
        Node<Integer> lastNode2= fetchLastElement(list2);
        if(lastNode1!=lastNode2)
            return null;

        int size1 = length(list1);
        int size2 = length(list2);

        Node<Integer> longer = size1>size2?list1:list2;
        Node<Integer> shorter = size2>size1?list1:list2;

        int k =Math.abs(size2-size1);
        for (int i = 0; i < k; i++) {
            longer=longer.next;
        }

        while (longer != shorter){
            longer=longer.next;
            shorter=shorter.next;
        }
        return longer;
    }

    private static Node<Integer> fetchLastElement(Node<Integer> list1) {
        Node<Integer> head=list1;
        while (head.next!=null){
            head=head.next;
        }
        return head;
    }

    private static int length(Node<Integer> list1) {
        Node<Integer> head=list1;
        int count=0;
        while (head!=null){
            head=head.next;
            count++;
        }
        return count;
    }


}
