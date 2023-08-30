package com.cs.hr.arraystring;

public class Problem11 {
    public static void main(String[] args) {
        String test = "chandr";
        Boolean flag = isUnique2(test);
        System.out.println(flag);




    }

    private static Boolean isUnique(String test) {
        for (int i = 0; i < test.length(); i++) {
            String a = test.substring(i,1+i);
            String test1 = test.substring(i+1,test.length());
            System.out.println(a + "  "+ test1);
            if(test1.indexOf(a)>0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isUnique1(String test) {
        int n = test.length();
        for (int i = 0; i < n-1; i++) {
            String a = test.substring(0,1);
            test = test.substring(1,test.length());
            System.out.println(a + "  "+ test);
            if(test.indexOf(a)>0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isUnique2(String test) {
        int checker = 0;
        for (int i = 0; i < test.length(); i++) {
            int val = test.charAt(i) - 'a';
            if((checker & (1<<val))>0){
                return false;
            }
            checker |= (1<<val);
        }
        return true;
    }
}
