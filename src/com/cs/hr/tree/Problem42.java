package com.cs.hr.tree;

public class Problem42 {

    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,6,7,8,9};

        Node root = createBinaryTree(arr,0,8);
        System.out.println(root);
        inOrder(root);
    }

    private static Node createBinaryTree(int[] arr, int start, int end) {
        if(start>end)
            return null;

        int mid=(start+end)/2;
         Node root=new Node(arr[mid],null,null);


        root.setLeft(createBinaryTree(arr,start,mid-1));
        root.setRight(createBinaryTree(arr,mid+1,end));
        return root;
    }

    private static void inOrder(Node root){
        if (root==null)
            return;

        inOrder(root.getLeft());
        System.out.println(root.getData());
        inOrder(root.getRight());
    }

}
