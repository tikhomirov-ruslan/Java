package KBTU;

import java.util.*;


public class Teacher {
	
	private String teacherName;
    private List<Course> courses;
    private String rankName;
	
    public Teacher(String teacherName, String rankName) {
        this.teacherName = teacherName;
        this.courses = new ArrayList<>();
        this.rankName = rankName;
    }

	public String getTeacherName() {
		return teacherName;
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	
	public void createCourse(String courseName) {
        Course course = new Course(courseName);
        courses.add(course);
    }

    public void addStudentToCourse(Student student, Course course) {
        course.addStudent(student);
    }

    public void assignGrade(Student student, Course course, String grade) {
        student.addGrade(course.getCourseName(), grade);
    }

	public String getRankName() {
		return rankName;
	}
	
//	public String toString() 
//	{
//		return 
//	}

}
