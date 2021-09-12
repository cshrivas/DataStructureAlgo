package com.cs.hr.tree;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String str = "He is a very very good boy, isn't he?";
        str=str.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str);
        String[] sa=str.split(" ");
        ArrayList<String> al= new ArrayList<String>();
        for (int i=0;i<sa.length;i++){
            if("".equals(sa[i].trim()))
                continue;
            al.add(sa[i]);
        }
        System.out.println(al.size());
        for (String s:al) {
            System.out.println(s);
        }

        //printCharWithFreq(str);
    }

    static final int SIZE = 26;

    // function to print the character and its
    // frequency in order of its occurrence
    static void printCharWithFreq(String str)
    {
        // size of the string 'str'
        int n = str.length();

        // 'freq[]' implemented as hash table
        int[] freq = new int[SIZE];

        // accumulate freqeuncy of each character
        // in 'str'
        for (int i = 0; i < n; i++) {
            freq[str.charAt(i) - 'a']++;
        }
        // traverse 'str' from left to right
        for (int i = 0; i < n; i++) {

            // if frequency of character str.charAt(i)
            // is not equal to 0
            if (freq[str.charAt(i) - 'a'] != 0) {

                // print the character along with its
                // frequency
                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i) - 'a'] + " ");

                // update frequency of str.charAt(i) to
                // 0 so that the same character is not
                // printed again
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
    }
}
