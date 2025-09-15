package test.heritage;

import infra.DAO;
import model.heritage.ScholarshipStudent;
import model.heritage.Student;

public class NewStudent {

    public static void main(String[] args) {

        DAO<Student> dao = new DAO<>();

        Student student = new Student(1L, "Alice");
        ScholarshipStudent scholarshipStudent = new ScholarshipStudent(2L, "Bob", 1000.0);

        dao.atomicInsert(student);
        dao.atomicInsert(scholarshipStudent);

        dao.close();
    }
}
