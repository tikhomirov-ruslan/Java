package system;

import java.util.*;

public class Teacher {
    private String teacherName;
    private String rankName;
    private List<String> courses;

    public Teacher(String teacherName, String rankName) {
        this.teacherName = teacherName;
        this.rankName = rankName;
        this.courses = new ArrayList<>();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getRankName() {
        return rankName;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void createCourse(String courseName) {
        courses.add(courseName);
    }

    public void addStudentToCourse(String courseName, String studentID) {

    }

    public void assignGrade(String courseName, String studentID, int grade) {
    }

    public void assignAttendance(String courseName, String studentID, boolean isPresent) {
    }

	public boolean hasPermission() {
		// TODO Auto-generated method stub
		return false;
	}

}
