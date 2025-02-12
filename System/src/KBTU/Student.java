package KBTU;

import java.util.*;

public class Student {
	
	private String studentName;
	private int studentID;
	
	private Set<StudentOrganization> organizations;
	private Map<String, String> grades;
	
	public Student(String studentName, int studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
//		this.organizations = new HashSet<>();
		this.grades = new HashMap<>();
	}
	
	
	public String getStudentName() {
		return studentName;
	}

	public int getStudentId() {
		return studentID;
	}


	public Set<StudentOrganization> getOrganizations() {
		return organizations;
	}
	
	public Map<String, String> getGrades() {
		return grades;
	}
	
	
	public void addGrade(String course, String grade) {
		grades.put(course, grade);
	}


}
