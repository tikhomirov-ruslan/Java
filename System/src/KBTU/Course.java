package KBTU;

import java.util.*;

public class Course {
	private String courseName;
	private List<Student> students;
	
	public Course (String courseName) {
		this.courseName = courseName;
		this.students = new ArrayList<>();
	}

	public String getCourseName() {
		return courseName;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
        students.add(student);
    }
	
}
