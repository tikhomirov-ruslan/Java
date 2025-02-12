package problem4;
import java.util.Vector;

class CheckingAccount extends Account{
	
	private int transactionCount;
	private static final int FREE_TRANSACTIONS = 5;
	private static final double TRANSACTION_FEE = 0.02;

	public CheckingAccount(int a) {
		super(a);
		transactionCount = 0;
	}
	
	public void deductFee() {
		double fee =  TRANSACTION_FEE * transactionCount;
		withdraw(fee);
		transactionCount = 0;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		transactionCount++;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		transactionCount++;
	}
	
	public String toString() {
		return super.toString() + " Кол-во транзакций: " + transactionCount;
	}
}
