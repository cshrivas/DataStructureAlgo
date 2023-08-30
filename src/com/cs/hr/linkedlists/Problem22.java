package com.cs.hr.linkedlists;

public class Problem22 {
    public static void main(String[] args) {
        Node<Integer> head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(7);
        head.appendToTail(8);
        head.printLinkedList();
        Node<Integer> knode = getKNode(head, 4);
        System.out.println(knode != null ?knode.data:null);
        int index = printKthdata(head,4);
        System.out.println(index);
    }

    private static int printKthdata(Node head, int i) {
        if(head ==null)
            return 0;

        int index = printKthdata(head.next,i)+1;
        if(index==i){
            System.out.println(head.data);
        }
        return index;
    }

    private static Node getKNode(Node head, int i) {
        Node n = head;
        Node kth = head;
        for (int j = 1; j < i; j++) {
            if(n.next==null)
                return null;
            n=n.next;
        }
        while(n.next!=null){
            n=n.next;
            kth=kth.next;
        }
        return kth;
    }
}
