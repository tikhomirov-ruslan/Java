package system;

import java.util.*;

public class Student {
    private String studentName;
    private String studentID;
    private Set<String> organizations;
    private Map<String, Integer> grades;

    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.organizations = new HashSet<>();
        this.grades = new HashMap<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public Set<String> getOrganizations() {
        return organizations;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public String getTranscript() {
        return "Transcript goes here...";
    }

    public void assignComplaints() {

    }


    public void registrationStudent() {

    }


    public void organizationRequest() {

    }

}
