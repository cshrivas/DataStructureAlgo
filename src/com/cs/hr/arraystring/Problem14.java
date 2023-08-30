package com.cs.hr.arraystring;

import java.util.Arrays;
import java.util.Locale;

public class Problem14 {
    public static void main(String[] args) {
        boolean result = check("Taaccsdt");
        System.out.println(result);

    }

    private static boolean check(String str) {
        str = str.replaceAll(" ","").toLowerCase(Locale.ROOT);
        System.out.println(str);
        int[] c = new int[26];
        for (int i = 0; i < str.length(); i++) {
            c[str.charAt(i)-'a']++;
        }
//        if(str.length()%2==1){
//            return Arrays.stream(c).map(e->e%2).sum() == 1 ? true : false;
//        }else {
//            return Arrays.stream(c).allMatch(e->e%2==0);
//        }
        int sum =  Arrays.stream(c).map(e->e%2).sum();
        return sum ==0 || sum ==1;
    }

    private static boolean check2(String str) {
        str = str.replaceAll(" ","").toLowerCase(Locale.ROOT);
        System.out.println(str);
        int checker =0;
        for (int i = 0; i <str.length(); i++) {
            int val = str.charAt(i)-'a';
         //   System.out.println("val = " + val);
            if((checker & (1<<val)) !=0){
                int mask = ~(1<<val);
                checker&=mask;
            }else {
                checker |= (1 << val);
            }
          //  System.out.println(Integer.toString(checker,2));
        }
//        if(str.length()%2==0){
//            return checker==0?true:false;
//        }else{
//            return Integer.bitCount(checker)==1?true:false;
//        }
        return (checker==0) || ((checker & (checker-1))==0);
    }
}
