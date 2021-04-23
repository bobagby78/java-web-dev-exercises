package org.launchcode.java.demos.lsn2controlflowandcollections.exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someValues = {1,1,2,3,5,8};

        System.out.println(Arrays.toString(someValues));
        for (int value : someValues){
            System.out.println(value);
        }
        for (int value : someValues){
            if (value % 2 !=0){
                System.out.println(value);
            }
        }
    }
}

