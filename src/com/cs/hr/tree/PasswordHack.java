package com.cs.hr.tree;

import java.util.Arrays;
import java.util.List;

public class PasswordHack {
    public static void main(String args []) {
        List<String> al =  Arrays.asList("hate", "hater", "rider");
        String pwd1 = "haterrider";
        String pwd2 = "haterider";
        validatePwd(al,pwd1);
        validatePwd(al,pwd2);

        List<String> al1 =  Arrays.asList("scooby", "doo", "dooby");
        String pass1 = "scoobydooby";
        String pass2 = "scoobydoodoobydoobydoo";
        String pass3 = "rscoobydoodoobydoobydoo";
        validatePwd(al1,pass1);
        validatePwd(al1,pass2);
        validatePwd(al1,pass3);
    }

    private static void validatePwd(List<String> al,String inputPassword) {
        char ca[] = inputPassword.toCharArray();
        String s1 = "";
        String temp="";
        int j=0;
        for(int i=0; i<ca.length; i++) {
            s1 =  s1 + Character.toString(ca[i]);
            if(al.contains(s1)) {
                temp=s1;
                j=i;
                s1 = "";
            }else if(i==ca.length-1 && s1.length()>0 && !("".equalsIgnoreCase(temp))){
                s1=temp;
                temp="";
                i=j;
            }
        }
        if(s1.length()>0){
            System.out.println("WRONG PASSWORD");
        } else {
            System.out.println("PASSWORD ACCEPTED");
        }
    }
}
