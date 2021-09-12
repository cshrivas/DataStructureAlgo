package com.cs.hr.tree;

class HuffmanLeaf extends HuffmanNodeParent {

    public HuffmanLeaf(int freq, char val) {
        super(freq);
        data = val;
    }
}
