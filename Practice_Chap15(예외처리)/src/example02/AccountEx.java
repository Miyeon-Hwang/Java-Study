package example02;

public class AccountEx {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.deposit(500);
		System.out.println("현재 잔액 : " + acc.getBalance());
		
		try {
			acc.withdraw(100);
			System.out.println("현재 잔액 : " + acc.getBalance());
			acc.withdraw(600);
			System.out.println("현재 잔액 : " + acc.getBalance());
		} catch (BalanceException e) {
			System.out.println("예외 원인 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("정상 종료");
		}
	}

}
