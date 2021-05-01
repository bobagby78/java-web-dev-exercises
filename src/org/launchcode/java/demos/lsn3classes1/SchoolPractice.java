package org.launchcode.java.demos.lsn3classes1;

import org.w3c.dom.ls.LSOutput;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student bagby = new Student("Jon Bagby", 12261978, 1, 4);
        bagby.setName("Juan Bolsabeja");
        System.out.println(bagby.getName());
        System.out.println(bagby.getStudentId());
        System.out.println(bagby.getGpa());

    }

}
