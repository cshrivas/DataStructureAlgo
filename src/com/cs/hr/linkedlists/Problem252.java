package com.cs.hr.linkedlists;

public class Problem252 {
    public static void main(String[] args) {
        Node<Integer> head1 = new Node(6);
        head1.appendToTail(1);
        head1.appendToTail(7);
        head1.printLinkedList();

        Node<Integer> head2 = new Node(2);
        head2.appendToTail(9);
        head2.appendToTail(5);
        head2.printLinkedList();

        int num1 = convertIntoNum(head1);
        int num2 = convertIntoNum(head2);
        Node<Integer> result = convertIntoList(num1+num2);
        result.printLinkedList();
    }

    private static Node<Integer> convertIntoList(int num) {
        Node head = null;
        while (num!=0){
            Node<Integer> n = new Node<>(num%10);
            num=num/10;
            n.next=head;
            head = n;
        }
        return head;
    }

    private static int convertIntoNum(Node<Integer> head) {
        if(head== null)
            return 0;
        Node<Integer> n = head;
        int num=0;
        while (n!=null){
            num = n.data + num*10;
            n=n.next;
        }
        return num;
    }
}
