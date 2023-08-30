package com.cs.hr.arraystring;

import java.util.Arrays;

public class Problem12 {
    public static void main(String[] args) {
        boolean flag = checkPermutation1("chandar", "chandra");
        System.out.println(flag);
    }

    private static boolean checkPermutation(String a, String b) {
        if(a.length() != b.length())
            return false;

        char[] c1 = a.toCharArray();
        Arrays.sort(c1);
        a = new String(c1);
        char[] c2 = b.toCharArray();
        Arrays.sort(c2);
        b = new String(c2);

        return a.equals(b);
    }

    private static boolean checkPermutation1(String a, String b) {
        if(a.length() != b.length())
            return false;

        int[] c1 = new int[128];
        for (int i = 0; i < a.length(); i++) {
            c1[a.charAt(i)]++;
        }
//        Arrays.stream(c1).forEach(System.out::print);
        for (int i = 0; i < b.length(); i++) {
            c1[b.charAt(i)]--;
            if(c1[b.charAt(i)] < 0)
                return false;
        }

        return true;
    }
}
