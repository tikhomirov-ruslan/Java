package problem4;

import java.util.Date;

public class Employee extends Person {
	
	private Date hireDate;
	private double annualSalary;
	private String nationalInsuranceNumber;
	
	public Employee(Date hireDate, double annualSalary, String nationalInsuranceNumber, String name) {
		
		super(name);
		this.hireDate = hireDate;
		this.annualSalary = annualSalary;
		this.nationalInsuranceNumber = nationalInsuranceNumber;
		
	}

	public Date getHireDate() {
		return hireDate;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}
	
	public String toString() {
        return "Employee: " +
               "Name: " + getName() + 
               "AnnualSalary: " + annualSalary +
               "HireDate: " + hireDate +
               "NationalInsuranceNumber: " + nationalInsuranceNumber;
	}
	
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
}
