package com.cs.hr.arraystring;

public class Problem13 {
    public static void main(String[] args) {
        String s = "Mr Chandra Shrivastav    ";
        int true_length =21;
        int space_count=0;
        for (int i = 0; i < true_length; i++) {
            if(' ' == s.charAt(i)){
                space_count++;
            }
        }
        int total = true_length + space_count*2;
        char[] c = new char[total];
        for (int i = 0,index=0; i < true_length; i++) {
            if(' ' ==  s.charAt(i)){
                c[index] = '%';
                index++;
                c[index] = '2';
                index++;
                c[index] = '0';
                index++;
            }else{
                c[index] = s.charAt(i);
                index++;
            }
        }
        System.out.println(c);
        System.out.println(new String(c).length());
    }
}
