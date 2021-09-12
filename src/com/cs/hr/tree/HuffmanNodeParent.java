package com.cs.hr.tree;

abstract class HuffmanNodeParent implements Comparable<HuffmanNodeParent> {
    public  int frequency; // the frequency of this tree
    public  char data;
    public  HuffmanNodeParent left, right;
    public HuffmanNodeParent(int freq) {
        frequency = freq;
    }

    // compares on the frequency
    public int compareTo(HuffmanNodeParent tree) {
        return frequency - tree.frequency;
    }
}
