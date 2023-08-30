package com.cs.hr.bitmanipulation;

public class Binary2Str {
    public static void main(String[] args) {
        double decimalNum = 0.35;
        System.out.println(printBinary(decimalNum));
    }

    private static String printBinary(double num) {
        StringBuilder binary = new StringBuilder();
        binary.append(".");
        if(num>=1 || num<=0) {
            return "ERROR";
        }
        while (num>0) {
            if(binary.length()>=32){
                System.out.println(binary.toString());
                return "ERROR";
            }
            double r = num * 2;
            if (r >= 1) {
                binary.append(1);
                num=r-1;
            } else {
                binary.append(0);
                num=r;
            }
        }
        return binary.toString();
    }
}
