package com.cs.hr.linkedlists;

import java.util.Stack;

public class Problem26 {
    public static void main(String[] args) {
        Node<String> head = new Node("a");
        head.appendToTail("b");
        head.appendToTail("c");
        head.appendToTail("d");
        head.appendToTail("c");
        head.appendToTail("b");
        head.appendToTail("a");
        head.printLinkedList();
        boolean result = checkPalindrome(head);
        System.out.println(result);
    }

    private static boolean checkPalindrome(Node<String> head) {
        Node faster = head;
        Node slow = head;
        Stack<String> stack = new Stack<>();
        while (faster != null && faster.next!=null){
            stack.push((String) slow.data);
            slow=slow.next;
            faster=faster.next.next;

        }
        if(faster!=null)
            slow=slow.next;

        while (slow!=null){
            if(!slow.data.equals(stack.pop()))
                return false;
            slow =slow.next;
        }
        return true;
    }
}
