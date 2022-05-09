package example02;

public class AccountEx {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.deposit(500);
		System.out.println("���� �ܾ� : " + acc.getBalance());
		
		try {
			acc.withdraw(100);
			System.out.println("���� �ܾ� : " + acc.getBalance());
			acc.withdraw(600);
			System.out.println("���� �ܾ� : " + acc.getBalance());
		} catch (BalanceException e) {
			System.out.println("���� ���� : " + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("���� ����");
		}
	}

}
