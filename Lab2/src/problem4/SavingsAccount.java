package problem4;
import java.util.Vector;

class SavingsAccount extends Account{
	
	private double interestRate;

	public SavingsAccount(int a, double interestRate) {
		
		super(a);
		this.interestRate = interestRate;
		
	}
	
	public void addInterest() {
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}
	
	public String toString() {
		return super.toString() + " Процентная ставка: " + interestRate + "%"; 
	}

}
