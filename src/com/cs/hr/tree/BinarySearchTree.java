package com.cs.hr.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinarySearchTree {

    // Temporary node for case 2
    static Node temp = new Node();

    public static void main(String[] args) {
        int[] arr={100,80,200,70,90,150,300,50,250,400,40,60};
        Node root=null;
        for (int j : arr) {
            root = insertNode(root, j);
        }
        //inorderTraverse(root);
        //inorderSuccessor(root,60);
        System.out.println(checkBST(root));
    }

    private static boolean checkBST(Node root) {
        if(root==null)
            return true;
        if(root.getLeft()!=null && root.getLeft().getData()>root.getData()){
            return false;
        }

        if(root.getRight()!=null && root.getRight().getData()<root.getData()){
            return false;
        }

        if(!checkBST(root.getLeft()) || !checkBST(root.getRight())){
            return false;
        }

        return true;

    }

    private static Node findMe(Node root, int i) {
        if(root==null)
            return null;
        else if(root.getData()==i)
            return root;
        else if(root.getData()>i)
            return findMe(root.getLeft(),i);
        else
            return findMe(root.getRight(),i);
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
          return root;
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

    private static Node findMaxNode(Node node) {
        if(node==null)
            return null;

        if(node.getRight()==null)
            return node;
        else
            return findMaxNode(node.getRight());
    }

    private static void inorderTraverse(Node root) {
        if(root==null)
            return;
        inorderTraverse(root.getLeft());
        System.out.println(root.getData());
        inorderTraverse(root.getRight());
    }

    private static void inorderSuccessor(Node root,int i){
        Node node=findMe(root,i);
        if(node.getRight()!=null){
            Node suc=findNextSuccessor(node.getRight());
            System.out.println(suc.getData());
            return;
        }
        Node suc=findMaxNode(root);
        if(suc.getData()==i) {
            System.out.println("last node");
        }else{
            findInorderRecursive(root,node);
//            List<Node> list= new ArrayList<>();
//            inorderTraverseSuc(root,list);
//            for (int j = 0; j < list.size(); j++) {
//                if(list.get(j).getData()==i){
//                    System.out.println(list.get(j+1).getData());
//                }
//            }
        }
    }

    static Node findInorderRecursive(Node root, Node x )
    {
        if (root==null)
            return null;

        if (root==x || (temp = findInorderRecursive(root.getLeft(),x))!=null ||
                (temp = findInorderRecursive(root.getRight(),x))!=null)
        {
            if (temp!=null)
            {
                if (root.getLeft() == temp)
                {
                    System.out.print( "Inorder Successor of "+x.getData());
                    System.out.print( " is "+ root.getData() + "\n");
                    return null;
                }
            }

            return root;
        }

        return null;
    }

    private static void inorderTraverseSuc(Node root, List<Node> list) {
        if(root==null)
            return;
        inorderTraverseSuc(root.getLeft(),list);
        //System.out.println(root.getData());
        list.add(root);
        inorderTraverseSuc(root.getRight(),list);
    }

}
