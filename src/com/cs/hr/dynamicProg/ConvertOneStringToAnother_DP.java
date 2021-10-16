package com.cs.hr.dynamicProg;

public class ConvertOneStringToAnother_DP {
    public static void main(String[] args) {
        int n=findMinOperations("table","chair");
        System.out.println(n);
    }

    private static int findMinOperations(String s1, String s2) {
        int[][] mat =new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if(i==0){
                    mat[i][j]=j;
                }else if(j==0){
                    mat[i][j]=i;
                }else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    mat[i][j]=mat[i-1][j-1];
                }else{
                    mat[i][j]=1 + Math.min(mat[i-1][j],Math.min(mat[i][j-1],mat[i-1][j-1]));
                }
            }
        }
        return mat[s1.length()][s2.length()];
    }
}
