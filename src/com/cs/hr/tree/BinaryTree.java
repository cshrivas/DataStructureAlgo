package com.cs.hr.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static void main(String[] args) {
        Node root= new Node();
        root.setData(20);
        root.setLeft(new Node(100,new Node(50,new Node(222,null,null),null),new Node(15,null,null)));
        root.setRight(new Node(3,new Node(250,null,null),new Node(35,null,null)));

        System.out.println(findMe(root,222));
        System.out.println(findMe(root,25));
        insertNode(root,25);
        //levelorderTraverse(root);
        deleteNode(root,20);
        levelOrderTraverse(root);
        System.out.println("Preorder");
        preorderTraverse(root);
        System.out.println("Inorder");
        inorderTraverse(root);
        System.out.println("Postorder");
        postorderTraverse(root);
        System.out.println("Level Order Traverse");
        levelOrderTraverse(root);
    }

    private static void deleteNode(Node root, int i) {
        if(root==null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node find=null;
        Node n=null;
        while (!queue.isEmpty()){
            n=queue.poll();
            if(n.getData()==i) {
                find=n;
            }
            if(n.getLeft()!=null)
                queue.add(n.getLeft());
            if(n.getRight()!=null)
                queue.add(n.getRight());

        }
        queue.add(root);
        while (find!=null && !queue.isEmpty()){
            Node k=queue.poll();
            if(k.getLeft().equals(n)) {
                k.setLeft(null);
                find.setData(n.getData());
                return;
            }else if(k.getRight().equals(n)) {
                k.setRight(null);
                find.setData(n.getData());
                return;
            }else{
                if(k.getLeft()!=null)
                    queue.add(k.getLeft());
                if(k.getRight()!=null)
                    queue.add(k.getRight());
            }
        }
    }

    private static void insertNode(Node root, int i) {
        if(root==null)
            root= new Node(i,null,null);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node n=queue.poll();
            if(n.getLeft()==null){
                n.setLeft(new Node(i,null,null));
                return;
            }else if(n.getRight()==null){
                n.setRight(new Node(i,null,null));
                return;
            }else{
                queue.add(n.getLeft());
                queue.add(n.getRight());
            }
        }
    }

    private static boolean findMe(Node root, int i) {
        if(root==null)
            return false;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node n=queue.poll();
            if(n.getData()==i)
                return true;
            else{
                if(n.getLeft()!=null)
                    queue.add(n.getLeft());
                if(n.getRight()!=null)
                    queue.add(n.getRight());
            }
        }
        return false;
    }

    public static void levelOrderTraverse(Node root) {
        if(root==null)
            return;
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node n=queue.poll();
            System.out.print(" "+n.getData());
            if(n.getLeft()!=null)
            queue.add(n.getLeft());
            if(n.getRight()!=null)
            queue.add(n.getRight());
        }
    }

    private static void postorderTraverse(Node root) {
        if(root==null)
            return;
        postorderTraverse(root.getLeft());
        postorderTraverse(root.getRight());
        System.out.println(root.getData());
    }

    private static void inorderTraverse(Node root) {
        if(root==null)
            return;
        inorderTraverse(root.getLeft());
        System.out.println(root.getData());
        inorderTraverse(root.getRight());
    }

    private static void preorderTraverse(Node root) {
        if(root==null)
            return;
        System.out.println(root.getData());
        preorderTraverse(root.getLeft());
        preorderTraverse(root.getRight());
    }
}
