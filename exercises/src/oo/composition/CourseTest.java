package oo.composition;

public class CourseTest {
    public static void main(String[] args) {

        Student student1 = new Student("John");
        Student student2 = new Student("Jane");
        Student student3 = new Student("Jack");

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student1);
        course2.addStudent(student3);

        student1.addCourse(course3);
        student2.addCourse(course3);
        student3.addCourse(course3);

        for(Student student : course1.students) {
            System.out.println("I'm taking course " + course1.name + " and my name is " + student.name);
        }

        //I did it using copilot
        System.out.println("Student: " + student1.name + ", Courses: " + student1.courses.stream().map(course -> course.name).toList());
    }
}
