package com.cs.hr.tree;

import java.util.LinkedList;
import java.util.Queue;

public class AvlTree {
    public static void main(String[] args) {
        int[] arr={30,20,40,10,5,3,4,50,60,70,65};
        Node root=null;
        for (int i=0;i<arr.length;i++){
            root=insertNode(root,arr[i]);
            //BinaryTree.levelOrderTraverse(root);
        }
        //System.out.println(FindMaxChain.maximumChain(root));
        //deleteNode(root,)

        //root=deleteNode(root,50);
        BinaryTree.levelOrderTraverse(root);
        for (int i=arr.length-1;i>=0;i--){
            System.out.println("Delete logic " + arr[i]);
            root=deleteNode(root,arr[i]);
            BinaryTree.levelOrderTraverse(root);
            System.out.println("");
        }
    }

    private static Node deleteNode(Node root, int i) {

        if(root == null)
            return null;

        if(i<root.getData())
            root.setLeft(deleteNode(root.getLeft(),i));
        else if(i>root.getData())
            root.setRight(deleteNode(root.getRight(),i));
        else
        {
            if(root.getLeft()!=null && root.getRight()!=null){
                Node successor=findNextSuccessor(root.getRight());
                root.setData(successor.getData());
                root.setRight(deleteNode(root.getRight(),successor.getData()));
            }else if(root.getRight()==null && root.getLeft()!=null){
                root=root.getLeft();
            }else if(root.getLeft()==null && root.getRight()!=null){
                root=root.getRight();
            }else{
                root =null;
            }
            return root;
        }
        root=balanceTree(root);
        return root;
    }

    private static Node findNextSuccessor(Node node) {
        if(node==null)
            return null;
        if(node.getLeft()==null)
            return node;
        else
            return findNextSuccessor(node.getLeft());
    }


    private static Node insertNode(Node root,int data){
        if(root==null) {
            return new Node(data, null, null);
        }
        if(root.getData()>data){
            root.setLeft(insertNode(root.getLeft(),data));
        }else {
            root.setRight(insertNode(root.getRight(),data));
        }
        root=balanceTree(root);
        return root;
    }

    private static Node balanceTree(Node root) {
        int balance = height(root.getLeft()) - height(root.getRight());
        //System.out.println("root: "+root +" balance: "+balance);
        if(balance >1){
            if(height(root.getLeft().getLeft()) >= height(root.getLeft().getRight())) {
                root=rightRotation(root);
            }else{
                root.setLeft(leftRotation(root.getLeft()));
                root=rightRotation(root);
            }
           // System.out.println("Balance : "+ (height(root.getLeft()) - height(root.getRight())));
        }else if(balance <-1){
            if(height(root.getRight().getRight()) >= height(root.getRight().getLeft())) {
                root=leftRotation(root);
            }else{
                root.setRight(rightRotation(root.getRight()));
                root=leftRotation(root);
            }
         //   System.out.println("Balance : "+ (height(root.getLeft()) - height(root.getRight())));
        }
       // System.out.println("root: "+root);
        return root;
    }


    private static Node leftRotation(Node root) {
        Node newRoot=root.getRight();
        root.setRight(newRoot.getLeft());
        newRoot.setLeft(root);
        return newRoot;
    }

    private static Node rightRotation(Node root) {
        Node newRoot = root.getLeft();
        root.setLeft(newRoot.getRight());
        newRoot.setRight(root);
        return newRoot;
    }

    private static int height(Node root) {
        // Base Case
        if (root == null)
        {
            return -1;
        }
        // Store the maximum height of
        // the left and right subtree
        int leftHeight = height(root.getLeft());

        int rightHeight = height(root.getRight());

        // Update height of the current node
        int ans = Math.max(leftHeight, rightHeight) + 1;

        return ans;
    }
}
