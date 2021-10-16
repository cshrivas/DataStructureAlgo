package com.cs.hr.arraystring;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix= new int[5][5];
        matrix[0] = new int[]{1, 2, 3, 4,5};
        matrix[1] = new int[]{6, 7, 8, 9 ,10};
        matrix[2] = new int[]{11, 12, 13 ,14, 15};
        matrix[3] = new int[]{16, 17, 18, 19, 20};
        matrix[4] = new int[]{21, 22, 23, 24, 25};
        printMatrix(matrix);
        matrix = rotateMatrix(matrix);
        System.out.println("Output");
        printMatrix(matrix);

    }

    private static int[][] rotateMatrix(int[][] matrix) {
        if(matrix[0].length != matrix.length)
            return matrix;

        int n = matrix.length;
        for (int i = 0; i <n/2 ; i++) {
            int last=n-i-1;
            for (int j = 0; j < last-i; j++) {
                int top=matrix[i][i+j];
                matrix[i][i+j] = matrix[last-j][i];
                matrix[last-j][i]=matrix[last][last-j];
                matrix[last][last-j]=matrix[j+i][last];
                matrix[j+i][last]=top;
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
