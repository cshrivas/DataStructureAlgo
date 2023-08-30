package com.cs.hr.linkedlists;

public class Problem251 {
    public static void main(String[] args) {
        Node<Integer> head1 = new Node(7);
        head1.appendToTail(1);
        head1.appendToTail(6);
        head1.printLinkedList();

        Node<Integer> head2 = new Node(5);
        head2.appendToTail(9);
        head2.appendToTail(2);
        head2.printLinkedList();

        int num1 = convertIntoNum(head1);
        int num2 = convertIntoNum(head2);
        System.out.println(num1+num2);
        Node<Integer> result = convertIntoListV1(num1+num2);
        result.printLinkedList();
    }

    private static Node<Integer> convertIntoList(int number) {
        Node<Integer> head;
        Node<Integer> pointer= new Node<>();
        head = pointer;
        boolean flag =true;
        while (number!=0){
            Node<Integer> node = new Node(number%10);
            number=number/10;

            if(flag){
                pointer = node;
                head = pointer;
                flag=false;
            }else{
                pointer.next=node;
                pointer = pointer.next;
            }

        }
        return head;

    }

    private static Node<Integer> convertIntoListV1(int number) {
        Node<Integer> head = null,current = null;
        while (number!=0){
            Node<Integer> node = new Node(number%10);
            number=number/10;
            if(head==null){
                head = node;
                current = head;
            }else{
                current.next = node;
                current = current.next;
            }
        }
        return head;
    }

    private static int convertIntoNum(Node<Integer> head) {
        if(head == null)
            return 0;
        int num = 0;
        Node<Integer> n = head;
        int count =0;
        while (n!=null){
            num = num + (int)n.data* (int)Math.pow(10,count);
            count++;
            n = n.next;
        }
        return num;
    }
}
