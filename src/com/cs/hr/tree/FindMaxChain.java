package com.cs.hr.tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxChain {
    public static Node maximumChain(Node root){
        if(root==null)
            return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node nodeMax=null;
        int count=-1;
        while (!queue.isEmpty()){
            Node node=queue.poll();
            int temp=countLeftChain(node)+ countRightChain(node) +1;
            System.out.println(node + " " + temp);
            if(temp>count){
                nodeMax=node;
                count=temp;
            }
            if(node.getRight()!=null){
                queue.add(node.getRight());
            }
            if(node.getLeft()!=null){
                queue.add(node.getLeft());
            }
        }
        return nodeMax;
    }


    private static int countLeftChain(Node root){
        if(root==null)
            return -1;
        int leftChain = countLeftChain(root.getLeft());
        return leftChain+1;
    }

    private static int countRightChain(Node root){
        if(root==null)
            return -1;
        int rightChain = countRightChain(root.getRight());
        return rightChain+1;
    }
}
