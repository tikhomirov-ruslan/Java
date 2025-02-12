package system;
import java.util.*;

public class Courses {
    private String courseName;
    private List<Student> students;
    private List<Teacher> teachers;
    public Courses(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void addStudents(Student student) {
        students.add(student);
    }
}
