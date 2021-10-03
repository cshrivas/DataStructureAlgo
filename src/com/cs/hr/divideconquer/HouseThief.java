package com.cs.hr.divideconquer;

public class HouseThief {
    public static void main(String[] args) {
        int[] houses={6, 7, 1, 3, 8, 2, 4};
        System.out.println(maxRobbery(houses,0));
    }

    private static int maxRobbery(int[] houses, int currentIndex) {
        if(currentIndex>=houses.length)
            return 0;

        int stealCurrent = houses[currentIndex]+ maxRobbery(houses,currentIndex+2);
        int stealSkipCurr=maxRobbery(houses,currentIndex+1);

        return Math.max(stealCurrent,stealSkipCurr);
    }
}
