package com.cs.hr.divideconquer;

public class LongestCommonSubSeq {
    public static void main(String[] args) {
        String s1="javaaid";
        String s2="javaid";
        System.out.println(findLongestCommSubSeq(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length()));

        System.out.println(findLCS(s1,s2,0,0));
    }

    private static int findLCS(String s1, String s2, int i1, int i2) {
        if(i1==s1.length() || i2==s2.length())
            return 0;

        int c1=0;
        if(s1.charAt(i1)==s2.charAt(i2))
            c1=1+findLCS(s1,s2,i1+1,i2+1);

        int c2=findLCS(s1,s2,i1+1,i2);
        int c3=findLCS(s1,s2,i1,i2+1);

        return Math.max(c1,Math.max(c2,c3));

    }

    private static int findLongestCommSubSeq(char[] s1, char[] s2, int l1, int l2) {
        if(l1<=0 || l2<=0)
            return 0;

        if(s1[l1-1]==s2[l2-1])
            return 1 + findLongestCommSubSeq(s1,s2,l1-1,l2-1);
        else
            return Math.max(findLongestCommSubSeq(s1,s2,l1-1,l2),findLongestCommSubSeq(s1,s2,l1,l2-1));
    }




}
