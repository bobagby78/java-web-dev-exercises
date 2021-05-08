package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.Scanner;

public class ArrayGradebook {

    public static void main(String[] args) {

        // Allow for at most 30 students
        int maxStudents = 30;                                    //Used in defining the size of the array, since it is static and must be pre-determined

        String[] students = new String[maxStudents];             //An array made of strings, used to hold new students as they are created by user
        double[] grades = new double[maxStudents];               //an array of doubles to hold student grades
        Scanner input = new Scanner(System.in);                  //set up an input variable to get info from user

        String newStudent;                                       //empty new student variable to be filled with user input via Scanner
        int numStudents = 0;                                     //Check line 26, this 0 is being used to add students at index "numStudents". as students are added, this number is incremented to add the next student at the next index

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {                                                        //See line 30
            newStudent = input.nextLine();                          //take input from the user and store it as newStudent

            if (!newStudent.equals("")) {                            //if the user enters a name (or more specifically, if what the user enters ISN'T a blank field...
                students[numStudents] = newStudent;                  //the input for newStudent becomes the value of student at index[numStudents] (the next available slot)
                numStudents++;                                       //increment numStudents for indexing purposes
            }

        } while(!newStudent.equals(""));                            //Starting at line 22, do the preceding block of code as long as you don't have a blank field entered

        // Get student grades
        for (int i = 0; i < numStudents; i++) {                     //after d-while for students, loop through the students created...
            System.out.print("Grade for " + students[i] + ": ");    //prompt user for grades for each student index and store it as the student[i]'s grade.
            double grade = input.nextDouble();                      //get user input for the grade after a student is entered.
            grades[i] = grade;                                      //using the index of each student being entered, build another array of grades at the same indices.
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i] + " (" + grades[i] + ")");
            sum += grades[i];
        }

        double avg = sum / numStudents;
        System.out.println("Average grade: " + avg);
    }

    //Essentially, we have two arrays lined up side by side. One array is the student names, the other is the student grades. we access these by index to print them out for user.


}