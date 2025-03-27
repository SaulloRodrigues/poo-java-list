package questao9;

import java.util.ArrayList;
import java.util.List;

public class Course {
    public String nameCourse;
    public int idCourse;
    public List<Student> students;

    public Course(String nameCourse, int idCourse) {
        this.nameCourse = nameCourse;
        this.idCourse = idCourse;
        this.students = new ArrayList<>();
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudent() {
        return students;
    }
}
