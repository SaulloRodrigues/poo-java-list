package questao9;
import java.util.ArrayList;
import java.util.List;

public class University {
    public String nameUniversity;
    public String description;
    public List<Course> courses;

    public University(String nameUniversity, String description) {
        this.nameUniversity = nameUniversity;
        this.description = description;
        this.courses = new ArrayList<>();
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void getNameCourses() {
        for (Course c: courses) {
            System.out.println("- " + c.nameCourse);
        }
    }

    public int getTotalCourses() {
        return courses.size();
    }

    public int getTotalStudents() {
        int totalStudents = 0;
         for (Course c: courses) {
             totalStudents += c.getAllStudent().size();
         }
         return totalStudents;
    }
}
