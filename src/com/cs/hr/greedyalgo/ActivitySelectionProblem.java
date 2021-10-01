package com.cs.hr.greedyalgo;

import java.util.ArrayList;
import java.util.Collections;

//Problem Statement :- We are given 'n' activities with their start and end times.
// Select the max number of activities that can be performed by a single person,
// assuming that a person can only work on a single activity at a time.
public class ActivitySelectionProblem {
    public static void main(String[] args) {
        ArrayList<Activity> activityList = new ArrayList<Activity>();

        //Insert activities in Arraylist
        activityList.add(new Activity("A1", 0, 6));
        activityList.add(new Activity("A2", 3, 4));
        activityList.add(new Activity("A3", 1, 2));
        activityList.add(new Activity("A4", 5, 8));
        activityList.add(new Activity("A5", 5, 7));
        activityList.add(new Activity("A6", 8, 9));


        int max = maxActivity(activityList);
        System.out.println(max);

    }

    private static int maxActivity(ArrayList<Activity> activityList) {
        Collections.sort(activityList);
        for(Activity a : activityList){
            System.out.println(a);
        }
        int count=1;
        System.out.println("Start Algo");
        Activity start = activityList.get(0);
        System.out.println(start);
        for (int a = 1; a < activityList.size(); a++) {
            if(activityList.get(a).getStartTime()>=start.getFinishTime()){
                start=activityList.get(a);
                System.out.println(start);
                count++;
            }
        }
        return count;
    }
}
