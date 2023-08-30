package com.cs.hr.arraystring;

public class Problem16 {
    public static void main(String[] args) {
        String test = compressStringv1("aaaa");
        System.out.println(test);
    }

    private static String compressString(String test) {
        String result = test.charAt(0) + "";
        int count=1;
        for (int i = 1; i <test.length(); i++) {
            if(test.charAt(i)==test.charAt(i-1)){
                count++;

            }else {
                result = result + count + test.charAt(i);
                count=1;
            }

            if(i==test.length()-1){
                result = result + count;
            }
        }
        return result;
    }

    private static String compressStringv1(String test) {
        String result = "";
        int count=0;
        for (int i = 0; i <test.length(); i++) {
            count++;
            if(i+1>=test.length() || test.charAt(i)!=test.charAt(i+1)){
                result+=""+ test.charAt(i)+count;
                count=0;
            }

        }
        return result.length()<test.length()?result:test;
    }
}
