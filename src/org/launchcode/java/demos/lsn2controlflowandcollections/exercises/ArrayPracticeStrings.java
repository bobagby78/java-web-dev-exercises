package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;

import java.util.Arrays;

public class ArrayPracticeStrings {
    public static void main(String[] args) {
        String greenEggs;
        greenEggs = "I would not, could not, in a box." +
                " I would not, could not with a fox. I will" +
                " not eat them in a house. I will not eat them with a mouse.";
        String greenEggsArray[];
        greenEggsArray= greenEggs.split("\\.");
        System.out.println(Arrays.toString(greenEggsArray));    }
}
