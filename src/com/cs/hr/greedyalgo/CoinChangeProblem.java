package com.cs.hr.greedyalgo;

public class CoinChangeProblem {
    public static void main(String[] args) {
        int[] denominations = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int rupee =10786;

        for (int i = denominations.length-1; i >=0 ; i--) {
            if(rupee>=denominations[i]){
                int den=denominations[i];
                int no=rupee/den;
                rupee=rupee-den*no;
                System.out.println(den+" * "+ no + " = " + den*no);
            }
        }

    }
}
