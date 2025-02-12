package KBTU.model;//package KBTU;

import KBTU.model.Student;

import java.util.*;

public class StudentOrganization extends Student {

	private Set<Student> members;
	private Student leader;

	public StudentOrganization(String studentName, String studentID, Set<Student> members, Student leader){
		super(studentName, studentID);
		this.members = new HashSet<>();
		this.leader = leader;

	}


	public Set<Student> getMembers() {
		return members;
	}

	public Student getLeader() {
		return leader;
	}

}
