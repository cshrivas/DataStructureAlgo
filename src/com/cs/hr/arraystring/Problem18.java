package com.cs.hr.arraystring;

import java.util.HashSet;

public class Problem18 {
    public static void main(String[] args) {
        int[][] matrix= new int[4][5];
        matrix[0] = new int[]{0, 2, 0, 4,5};
        matrix[1] = new int[]{6, 7, 8, 9 ,10};
        matrix[2] = new int[]{0, 12, 13 ,14, 15};
        matrix[3] = new int[]{16, 17, 18, 19, 20};

        printMatrix(matrix);
        matrix = makeZero(matrix);
        printMatrix(matrix);
    }

    private static int[][] makeZero(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (Integer i :row) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=0;
            }
        }
        for (Integer i :col) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i]=0;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(String.valueOf(matrix[i][j]).length()==1?"  ":" ");
            }
            System.out.println("");
        }
    }
}
