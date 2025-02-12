package KBTU.model;

import java.io.Serializable;
import java.util.*;

public class Course implements Serializable {
	private String courseId;
	private String courseName;
	private List<Major> majors = new LinkedList<>();
    private List<Student> students = new LinkedList<>();

    public Course (String courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void addMajors(Major major) {
		majors.add(major);
	}

	public String getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public List<Major> getMajors() {
		return majors;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setMajors(List<Major> majors) {
		this.majors = majors;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course{" +
				"courseId='" + courseId + '\'' +
				", courseName='" + courseName + '\'' +
				", majors=" + majors +
				", students=" + students +
				'}';
	}
}
