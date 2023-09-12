package com.cs.hr.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem43 {
    public static void main(String[] args) {
        Node root= new Node(30,
                new Node(10,new Node(5,null,null),new Node(15,null,null)),
                new Node(40,new Node(35,null,null),new Node(45,null,null)));

        List<LinkedList<Node>> linkedLists = levelLinkedList(root);
        for (LinkedList<Node> list: linkedLists) {
            for (Node n: list) {
                System.out.print(n.getData());
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static List<LinkedList<Node>> levelLinkedList(Node root){
        List<LinkedList<Node>> result= new ArrayList<>();

        LinkedList<Node> linkedList= new LinkedList<>();
        if (root!=null){
            linkedList.add(root);
        }

        while (linkedList.size()!=0){
            result.add(linkedList);
            LinkedList<Node> parents= linkedList;
            linkedList= new LinkedList<>();
            for (Node node:parents){
                if (node.getLeft()!=null){
                    linkedList.add(node.getLeft());
                }
                if (node.getRight()!=null){
                    linkedList.add(node.getRight());
                }
            }
        }
        return result;
    }
}
