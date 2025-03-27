package questao9;
import java.util.Random;

public class Student {
    public String name;
    Random random = new Random();
    private final int idStudent;
    public Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.idStudent = random.nextInt(99999);
        this.course = course;
    }

    public int getIdStudent() {
        return idStudent;
    }
}