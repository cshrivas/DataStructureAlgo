package com.cs.hr.tree;

class HuffmanNode extends HuffmanNodeParent {

    public HuffmanNode(HuffmanNodeParent l, HuffmanNodeParent r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }

}
