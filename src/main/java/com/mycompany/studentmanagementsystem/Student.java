
package com.mycompany.studentmanagementsystem;


 /**
 * Represents a student in the system.
 *
 * @author Piotr Dekowski
 * @version 1.0
 */
public class Student {

    private int id;
    private String name;
    private String course;

    /**
     * Creates a new Student object.
     *
     * @param id student ID
     * @param name student name
     * @param course course name
     */
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    /**
     * Returns student ID.
     *
     * @return student ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns student name.
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns course name.
     *
     * @return course name
     */
    public String getCourse() {
        return course;
    }

    /**
     * Returns formatted student details.
     *
     * @return student information
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Course: " + course;
    }
}

