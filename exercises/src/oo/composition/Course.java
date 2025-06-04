package oo.composition;

import java.util.ArrayList;

public class Course {

    final String name;
    final ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addStudent(Student student) {
        this.students.add(student);
        student.courses.add(this);
    }
}
