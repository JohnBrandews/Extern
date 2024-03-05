package com.variables;
public class Student {
   // private instance variables
   private String name;
   private int age;
   //class variables to track number of students
   private static int totalStudents = 0;
   
    //constructor
public Student(String name, int age) {
    this.name = name;
    this.age = age;
    //increment the class variable  when a new student is created
    totalStudents++;
}
//method to get the total number of students
public static int getTotalStudents() {
    return totalStudents;
}
}
