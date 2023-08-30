package com.cs.hr.arraystring;

public class Problem15 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1,10,3,7,5);
//        list.stream().peek(System.out::println).filter(x->x>5).findAny();
//        System.out.println("-------");
//        list.stream().peek(System.out::println).filter(x->x>5).collect(Collectors.toList());
        boolean flag = checkEdit("pale", "pales");
        System.out.println(flag);
    }

    private static boolean checkEdit(String orig, String edit) {
        if(orig.length()==edit.length()){
            boolean flag=false;
            for (int i = 0; i < orig.length(); i++) {
                if(orig.charAt(i)!=edit.charAt(i)){
                    if (flag)
                        return false;
                    else
                        flag=true;
                }
            }
            return true;
        }else if(orig.length() - 1 == edit.length()){
            boolean flag=false;
            for (int i = 0,j=0; i < edit.length(); ) {
                if(orig.charAt(i)!=edit.charAt(j)){
                    if (flag)
                        return false;
                    else{
                        i++;
                        flag=true;
                    }
                }else {
                    i++;
                    j++;
                }
            }
            return true;
        }else if(orig.length() + 1 == edit.length()){
            boolean flag=false;
            for (int i = 0,j=0; i < orig.length(); ) {
                if(orig.charAt(i)!=edit.charAt(j)){
                    if (flag)
                        return false;
                    else{
                        j++;
                        flag=true;
                    }
                }else {
                    i++;
                    j++;
                }
            }
            return true;
        }else
            return false;
    }
}
