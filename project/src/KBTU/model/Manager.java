package KBTU.model;

import java.util.Date;

public class Manager extends User {
	private String managerId;
    private String iin;
	private String fullName;
	private Date birthDate;
    private String gender;
	private Date hireDate;

	public Manager(String username, String password, String managerId, String iin, String fullName,
                   Date birthDate, String gender, Date hireDate) {
		super(username, password);
        this.managerId = managerId;
        this.iin = iin;
		this.fullName = fullName;
		this.birthDate = birthDate;
        this.gender = gender;
		this.hireDate = hireDate;
	}

    public String getManagerId() {
        return managerId;
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
        return "Manager{" +
                "login='" + super.getUsername() + '\'' +
                "managerId='" + managerId + '\'' +
                ", iin='" + iin + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
