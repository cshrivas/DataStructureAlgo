package com.cs.hr.tree;

public class MinDiffBtwNodes {

    static int min=Integer.MAX_VALUE;
    static Node prev;
    public static void main(String[] args) {
        Node root= new Node();
        root.setData(20);
        root.setLeft(new Node(10,null,null));
        root.setRight(new Node(25,null,null));

        System.out.println(getMinimumDifference(root));
    }

    public static int getMinimumDifference(Node root) {

        if(root==null){
            return min;
        }

        getMinimumDifference(root.getLeft());

        if(prev!=null)
            min=Math.min(root.getData()-prev.getData(),min);

        prev=root;

        getMinimumDifference(root.getRight());

        return min;
    }
}
