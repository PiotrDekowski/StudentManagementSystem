
package com.mycompany.studentmanagementsystem;
/**
 * Main class for the Student Management System.
 *
 * @author Piotr Dekowski
 */

public class Main {
   public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student student1 = new Student(1, "Piotr Dekowski", "Computing and IT");
        Student student2 = new Student(2, "Zachary Dekowski", "Software Engineering");

        manager.addStudent(student1);
        manager.addStudent(student2);

        System.out.println("Student List");
        System.out.println("------------");

        
        manager.displayStudents();
        
        System.out.println("Number of students: " + manager.getStudentCount());
        System.out.println();
        
      
        System.out.println("Removing student with ID 1...");
        System.out.println();

        manager.removeStudent(1);

        System.out.println();
        System.out.println("Updated Student List");
        System.out.println("--------------------");

        manager.displayStudents();
        
        System.out.println("Number of students: " + manager.getStudentCount());
    }

}
