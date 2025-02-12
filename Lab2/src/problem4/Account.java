package problem4;
import java.util.Vector;

class Account {
	
	private double balance;
	private int accNumber;

	public Account(int a) {
		
		balance = 0.0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		balance +=  sum;
	}
	
	public void withdraw(double sum) {
		if (balance >= sum) {
			balance -= sum;
		}
		else {	
			System.out.println("Недостаточно средств");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		withdraw(amount);
		other.deposit(amount);
	}
	
	public String toString() {
		return "Счет #" + accNumber + " Баланс: " + balance;
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
