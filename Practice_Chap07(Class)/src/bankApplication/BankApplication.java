package bankApplication;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	
	private static Scanner sc = new Scanner(System.in);
	private static Account[] accountArray = new Account[100]; // ���⼭�� stack�� accountArray ���� �޸� �Ҵ�, heap�� 100���� Account ��ü�� �ּҸ� ���� ������ ������ �Ҵ�Ǵ� ��. Account ��ü�� ���� attach ���� ���� ����
	private static int accNum = 0;
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. �����ϱ� | 4. ����ϱ� | 5. ����");
			System.out.println("�����ϼ��� : ");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				createAccount();
				break;
			case 2:
				showAccountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			
			}
		}
		
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		System.out.println("���¹�ȣ�� �Է��ϼ��� : ");
		String ano = sc.next(); // sc.nextLine() : �� ���� ����(���� ����) / sc.next() : �ܾ� ����(���� ����)
		
		System.out.println("�����ָ� �Է��ϼ��� : ");
		String owner = sc.next();
		
		System.out.println("�Ա��� �ݾ��� �Է��ϼ��� : ");
		int balance = sc.nextInt();
		
		Account acc = new Account(ano, owner, balance);
		accountArray[accNum++] = acc; // accountArray ���� ������ �� heap�� �Ҵ��س��� �޸� ������ ������ Account ��ü�� ������ �������ִ� ��!
		
		System.out.println("���»����� �Ϸ��߽��ϴ�. ���¹�ȣ : " + acc.getAno() + ", ������ : " + acc.getOwner() + ", �ܾ� : " + acc.getBalance());
	}
	
	private static void showAccountList() {
		if (accNum == 0) {
			System.out.println("������ ���°� �����ϴ�");
		}
		for (int i = 0; i < accNum; i++) {
			System.out.println("���¹�ȣ : " + accountArray[i].getAno() + ", ������ : " + accountArray[i].getOwner() + ", �ܾ� : " + accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("�Ա��� ���¸� �Է��ϼ��� : ");
		String ano = sc.next();
		
		System.out.println("�Ա��� �ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		
		Account acc = findAccount(ano);
		if (acc == null) {
			System.out.println("�߸��� ���¹�ȣ�Դϴ�. �Աݿ� �����߽��ϴ�.");
		}
		else {
			acc.deposit(money);
			System.out.println("�Աݿ� �����߽��ϴ�. ���¹�ȣ : " + acc.getAno() + ", ���� �ܾ� : " + acc.getBalance());
		}
	}
	
	private static void withdraw() {
		System.out.println("����� ���¸� �Է��ϼ��� : ");
		String ano = sc.next();
		
		System.out.println("����� �ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		
		Account acc = findAccount(ano);
		if (acc == null) {
			System.out.println("�߸��� ���¹�ȣ�Դϴ�. ��ݿ� �����߽��ϴ�.");
		}
		else {
			boolean success = acc.withdraw(money);
			if (success) {
				System.out.println("��ݿ� �����߽��ϴ�. ���¹�ȣ : " + acc.getAno() + ", ���� �ܾ� : " + acc.getBalance());
			}
			else {
				System.out.println("�ܾ��� �����մϴ�. ��ݿ� �����߽��ϴ�.");
			}
		}
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < accNum; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		return null;
	}
}
