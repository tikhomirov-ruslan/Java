package KBTU.model;

import java.util.Date;

public class Admin extends User{
    private String id;
	private String fullName;
    private Date hireDate;

	public Admin(String username, String password, String id, String fullName, Date hireDate) {
		super(username, password);
        this.id = id;
		this.fullName = fullName;
        this.hireDate = hireDate;
	}

    public String getId() {
        return id;
    }

    public String getFullName() {
		return fullName;
	}

    public Date getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "login='" + super.getUsername() + '\'' +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
