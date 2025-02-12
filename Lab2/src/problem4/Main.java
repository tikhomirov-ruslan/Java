package problem4;

public class Main {

	public static void main(String[] args) {
			
		Bank bank = new Bank();
		
		Account account1 = new SavingsAccount(1, 3.5);
		Account account2 = new CheckingAccount(2);
		Account account3 = new Account(3);
		
		bank.openAccount(account1);
		bank.openAccount(account2);
		bank.openAccount(account3);
		
		account1.deposit(1000.0);
		account2.deposit(500.0);
		account3.deposit(2000.0);
		
		bank.update();
		
		bank.printAccounts();
		
		bank.closeAccount(account3);
		
		System.out.println("\nПосле закрытия счета:");
		bank.printAccounts();
		
	}
	
}
