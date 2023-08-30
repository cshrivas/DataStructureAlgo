package com.cs.hr.arraystring;

public class Problem19 {
    public static void main(String[] args) {
        boolean flag = checkSubstring("waterbottle","bottlewater");
        System.out.println(flag);
    }

    private static boolean checkSubstring(String s1, String s2) {

        if(s1.length() == s2.length() && s1.length()>0){
            s1=s1+s1;
            return s1.contains(s2);
        }
        return false;
    }
}
