package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList; //import ArrayList class so we don't have to type this whole filepath each time we make a new ArrayList
import java.util.Scanner;   // same as above, except with the Scanner class, but this one is basically a "Listener" for user input

public class ArrayListGradebook { //create a new class

    public static void main(String[] args) {    //main method allows execution of code

        ArrayList<String> students = new ArrayList<>(); //from the first character, we're declaring a type (ArrayList, made up of Strings) students is the name of the new ArrayList. new(it's an instantiation of the ArrayList class)
        ArrayList<Double> grades = new ArrayList<>();   // same as above, but it's called grades and it's made up of Doubles ex: 1.234
        Scanner input = new Scanner(System.in);         // Scanner (type declaration) input (name of variable) new (instantiation of Scanner class) System.in- it's scanning for input.
        String newStudent;                              // String (datatype) newStudent- name of variable. it's just a variable, not initialized yet.

        System.out.println("Enter your students (or ENTER to finish):"); //Print a string to the console to prompt user to type something for Scanner to pick up. In this case, a student name

        // Get student names from user
        do {
            newStudent = input.nextLine();  // newStudent empty variable will be initialized to the next user input.

            if (!newStudent.equals("")) {   // if there is input (more specifically, if there isn't NOT input...
                students.add(newStudent);   // add the input gathered to the students ArrayList
            }
        } while(!newStudent.equals(""));    // as long as the input isn't an empty string, keep doing the 'do' loop

        // Get student grades from user
        for (String student : students) {   //for each loop- for each String student in the students ArrayList...
            System.out.print("Grade for " + student + ": ");    //prompt user to input a grade for the student
            Double grade = input.nextDouble();  // a new variable of type Double (object) will be scanned. The Double is used (instead of double) because all values stored in a collection (Array, ArrayList, HashMap) MUST BE OBJECTS
            grades.add(grade);  //add the grade to the grade ArrayList
        }

        // Print class roster
        System.out.println("\nClass roster:");  //Show the user the class roster
        double sum = 0.0;   //we'll be looking to add up something...

        for (int i = 0; i < students.size(); i++) {  //standard for loop to go through the students ArrayList
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");   //print out: students.get(i) will print out each student's name + grades.get(i) will print out each student's grade
            sum += grades.get(i);   //sum will have each student's grade added up
        }

        double avg = sum / students.size(); //avg is a new variable of type double(primitive), it will show the sum of all student grades divided by the number of students (students.size())
        System.out.println("Average grade: " + avg);    //prints out the phrase Average grade: and the avg variable we just created.
    }
}
