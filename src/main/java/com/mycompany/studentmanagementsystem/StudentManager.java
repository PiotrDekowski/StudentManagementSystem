
package com.mycompany.studentmanagementsystem;

import java.util.ArrayList;

/**
 * Manages student records in the system.
 *
 * @author Piotr Dekowski
 * @version 1.0
 * @since October 2025
 */
public class StudentManager {

    private ArrayList<Student> students;

    /**
     * Creates a new StudentManager object.
     */
    public StudentManager() {
        students = new ArrayList<>();
    }

    /**
     * Adds a student to the system.
     *
     * @param student student object
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Removes a student by ID.
     *
     * @param id student ID
     */
    public void removeStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    /**
    * Finds a student by ID.
    *
    * @param id student ID
    * @return student object or null if not found
    */
    
    public Student findStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
       
    }
    
    /**
     * Displays all students.
     */
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
