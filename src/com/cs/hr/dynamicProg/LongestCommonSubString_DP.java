package com.cs.hr.dynamicProg;

public class LongestCommonSubString_DP {
    public static void main(String[] args) {
        int n = findMaxSubString("CHANDRA","ANDYNDRA");
        System.out.println(n);
    }

    private static int findMaxSubString(String s1, String s2) {
        int[][] mat= new int[s1.length()+1][s2.length()+1];
        int highest=0;
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if(i>0 && j>0 && s1.charAt(i-1) == s2.charAt(j-1)){
                    mat[i][j]=1+mat[i-1][j-1];
                }else {
                    mat[i][j]=0;
                }
                highest = Math.max(mat[i][j],highest);
            }
        }

        return highest;
    }
}
