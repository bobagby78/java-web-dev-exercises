package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashMap {

    public static void main(String[] args) {

        HashMap<String, Double> students = new HashMap<>();                 //Declare a HashMap called students. it's made of strings for keys (student names) and doubles for values (student grades)
        Scanner input = new Scanner(System.in);                             //Declare an input variable that will pull user input via Scanner
        String newStudent;                                                  //Declare a newStudent variable to be filled by user input
        System.out.println("Enter your students (or ENTER to finish):");    //prompt the user for a name

        // Get student names and grades
        do {                                                                //See line 31

            System.out.print("Student: ");                                  //prompt the user for the name to stand in as KEY in the HashMap
            newStudent = input.nextLine();                                  //initialize the empty newStudent variable declared on line 13 to the input grabbed from user

            if (!newStudent.equals("")) {                                   //if user provides input (If input is NOT empty string)...
                System.out.print("Grade: ");                                //Prompt for a grade VALUE for the previously entered student
                Double newGrade = input.nextDouble();                       //Grab user input for grade and initialize it as the newGrade
                students.put(newStudent, newGrade);                         //take the newStudent KEY from line 20, and the newGrade VALUE from line 24, and .put() them into the HashMap

                // Read in the newline before looping back
                input.nextLine();                                           //If this line didn't exist, the loop would end. IDK why, but do I need to?
            }

        } while(!newStudent.equals(""));                                    //as long as the user inputs information, keep the do-while loop going

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;                                                   //'empty' value to be added to another previously entered value

        for (Map.Entry<String, Double> student : students.entrySet()) {     //Map.Entry is a way to loop through a HashMap (Map) and for each key: value pair (Entry), do something with it.
            System.out.println(student.getKey() + " (" + student.getValue() + ")");         //cont: this can be read just as **for (int number : numberArray){code block};**  loop
            sum += student.getValue();
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);
    }
}
