package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Course {
    private String title;
    private String description;
    private String instructor;
//    private ArrayList<Student> enrolledStudents;
    private Integer credits;

    public Course(String title, String description, String instructor, Integer credits){
        this.title = title;
        this.description = description;
        this.instructor = instructor;
        this.credits = credits;
    }


    @Override
    public String toString(){
        return "\nCourse title: " + this.title +
                "\nCourse description: " + this.description +
                "\nInstructor: " + this.instructor +
                "\nCredits: " + this.credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(title, course.title) && Objects.equals(description, course.description) && Objects.equals(instructor, course.instructor) && Objects.equals(credits, course.credits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, instructor, credits);
    }

    public static void main(String[] args) {
        Teacher bagby = new Teacher("Jon", "Bagby", "World Languages", 12.0);

        Course spanish101 = new Course("Spanish 101", "Introductory Spanish class", "Bagby", 3);
        System.out.println(spanish101 +"\n");

        String[] span101Str = spanish101.toString().split("\n");
        System.out.println("test" + "\n" + span101Str[0] + "\ntest");

    }
}
