package system;

import java.util.*;

public class StudentOrganizations {
    private Set<Student> members;
    private Student leader;
    public StudentOrganizations() {
        this.members = new HashSet<>();
    }
    public enum Role {
        MEMBER, LEADER
    }
    public Set<Student> getMembers() {
        return members;
    }
    public Student getLeader() {
        return leader;
    }
    public void addMember(Student student) {
        members.add(student);
    }
    public void addLeader(Student student) {
        if (members.contains(student)) {
            leader = student;
        } else {
            System.out.println("The student must be a member to become a leader.");
        }
    }
}
