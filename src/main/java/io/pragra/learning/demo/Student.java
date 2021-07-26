package io.pragra.learning.demo;

public class Student {
    private int studentID;
    public String name;
    private Course course;


    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                '}';
    }




}
