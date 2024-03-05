package com.variables;

public class Main {
    public static void main(String[] args) {
        //creating objects of the student class
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob",22);
        Student student3 = new Student("job",34);
        //accessing instance variables
        System.out.println("Student1: " + student1.getTotalStudents());
        System.out.println("Student2: " + student2.getTotalStudents());
        System.out.println("Student3: " + student3.getTotalStudents());
        //accessing class variables
        System.out.println("total students" + Student.getTotalStudents());
    }
}
