package com.cs.hr.tree;

class Decoding {

/*
	class Node
		public  int frequency; // the frequency of this tree
    	public  char data;
    	public  Node left, right;

*/

    void decode(String s, HuffmanNodeParent root) {
        int[] ints1 = s.chars()
                .map(x -> x - '0')
                .toArray();

        HuffmanNodeParent node=root;
        for (int i = 0; i < ints1.length; i++) {

            if(ints1[i]==1){
                 node=node.right;
            }else{
                 node=node.left;
            }
            if(node.data!='\u0000'){
                System.out.print(node.data);
                node=root;
            }

        }

    }



}
