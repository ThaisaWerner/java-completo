package oo.composition;

import java.util.ArrayList;

public class Student {

    final String name;
    final ArrayList<Course> courses = new ArrayList<>(); //Cannot be instantiated again because its final

    Student (String name) {
        this.name = name;
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.students.add(this);
    }
}
