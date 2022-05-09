package example02;

public class Account {
	
	int balance;
	
	public Account() {}
	
	public int getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) throws BalanceException{
		if (this.balance < money) {
			throw new BalanceException("ÀÜ¾× ºÎÁ·");
		}
		this.balance -= money;
	}

}
