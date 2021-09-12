package com.cs.hr.tree;

import java.util.Scanner;

public class LeastCommonAncestor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        int v1 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        Node ans = lca(root,v1,v2);
        System.out.println(ans.getData());
    }

    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        if(root==null)
            return null;

        if(root.getData() > v1 && root.getData()>v2){
            return lca(root.getLeft(),v1,v2);
        }
        if(root.getData() < v1 && root.getData()<v2){
            return lca(root.getRight(),v1,v2);
        }
        return root;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data,null,null);
        } else {
            Node cur;
            if(data <= root.getData()) {
                cur = insert(root.getLeft(), data);
                root.setLeft(cur);;
            } else {
                cur = insert(root.getRight(), data);
                root.setRight(cur);
            }
            return root;
        }
    }
}
