package KBTU.model;

import java.util.*;


public class Teacher extends User {
    private String teacherId;
    private String iin;
    private String fullName;
    private Date birthDate;
    private String gender;
    private Date hireDate;

    public Teacher(String username, String password, String teacherId, String iin, String fullName, Date birthDate,
                   String gender, Date hireDate) {
        super(username, password);
        this.teacherId = teacherId;
        this.iin = iin;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    public String getTeacherId() {
        return teacherId;
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

    public Date getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "login='" + super.getUsername() + '\'' +
                "teacherId='" + teacherId + '\'' +
                ", iin='" + iin + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
