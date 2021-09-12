package com.cs.hr.tree;

import java.util.LinkedList;
import java.util.Queue;

public class EdgeProblem {
    public static void main(String[] args) {
        Node node10 = new Node(10,null,null);
        Node node11 = new Node(11,null,null);
        Node node12 = new Node(12, null,null);
        Node node8 = new Node(8,null,null);
        Node node9 = new Node(9,node11,node12);
        Node node4 = new Node(4,null,null);
        Node node5 = new Node(5,node8,node9);
        Node node6 = new Node(6,null,node10);
        Node node7 = new Node(7,null,null);
        Node node2 = new Node(2,node4,node5);
        Node node3 = new Node(3,node6,node7);
        Node root = new Node(1,node2,node3);
        printEdgeElement(root,node10,3);

    }

    private static void printEdgeElement(Node root, Node node, int k) {
        Node nodeTemp=node;
        Node parent=nodeTemp;
        for (int i= k,j=k;i>=0;i--) {
            edgeElement(nodeTemp,j);
            nodeTemp=parent;
            j=i;
            parent=getParent(root,nodeTemp);
            j--;
            if(parent ==null)
                break;
            if(parent.getLeft()!=null && parent.getLeft().getData() == nodeTemp.getData() && j!=0) {
                nodeTemp = parent.getRight();
                j--;
            }else if(parent.getRight() != null && parent.getRight().getData() == nodeTemp.getData() && j!=0) {
                nodeTemp = parent.getLeft();
                j--;
            }else if(j==0){
                nodeTemp=parent;
            }
        }
    }

    private static Node getParent(Node root,Node node) {
        if(node==null || root==null)
            return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node n=queue.poll();
            if(n.getLeft()!=null) {
                if(node.getData()==n.getLeft().getData())
                    return n;
                queue.add(n.getLeft());
            }
            if(n.getRight()!=null) {
                if(node.getData()==n.getRight().getData())
                    return n;
                queue.add(n.getRight());
            }
        }
        return null;
    }

    private static void edgeElement(Node root, int i) {
        if(root==null)
            return;
        if(i==0)
            System.out.println(root.getData());
        edgeElement(root.getLeft(),i-1);
        edgeElement(root.getRight(),i-1);
    }
}
