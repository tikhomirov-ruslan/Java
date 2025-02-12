package problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee{

	private Vector<Employee> team;
	private double bonus;
	
	public Manager(String name, double annualSalary, Date hireDate, String nationalInsuranceNumber, Vector<Employee> team, double bonus) {
		
		super(hireDate, annualSalary, name, nationalInsuranceNumber);
		this.team = team;
		this.bonus = bonus;
		
	}
	
	public Vector<Employee> getTeam() {
		return team;
	}

	public double getBonus() {
		return bonus;
	}
	
	public String toString() {
        return "Manager: " +
               "Name " + getName() +
               "AnnualSalary: " + getAnnualSalary() +
               "HireDate: " + getHireDate() +
               "NationalInsuranceNumber: " + getNationalInsuranceNumber() + 
               "Team: " + team +
               "Bonus: " + bonus;
	}
}
