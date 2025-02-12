package KBTU.model;

import java.util.*;

public class Student extends User{
	private String studentId;
	private String iin;
	private String fullName;
	private Date birthDate;
	private String gender;
	private Major major;
	private int yearOfStudy;
	private List<Course> courses;

	public Student(String user, String password, String studentId, String iin, String fullName, Date birthDate,
				   Major major, int yearOfStudy, String gender) {
		super(user, password);
		this.studentId = studentId;
		this.iin = iin;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.major = major;
		this.yearOfStudy = yearOfStudy;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getIin() {
		return iin;
	}

	public String getFullName() {
		return fullName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getGender() {
		return gender;
	}

	public Major getMajor() {
		return major;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setIin(String iin) {
		this.iin = iin;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentId='" + studentId + '\'' +
				", iin='" + iin + '\'' +
				", fullName='" + fullName + '\'' +
				", birthDate=" + birthDate +
				", gender='" + gender + '\'' +
				", major=" + major +
				", yearOfStudy=" + yearOfStudy +
				", courses=" + courses +
				'}';
	}
}
