package bankApplication;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
	
	private static Scanner sc = new Scanner(System.in);
	private static Account[] accountArray = new Account[100]; // 여기서는 stack에 accountArray 변수 메모리 할당, heap에 100개의 Account 객체의 주소를 각각 저장할 공간이 할당되는 것. Account 객체는 아직 attach 되지 않은 상태
	private static int accNum = 0;
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금하기 | 4. 출금하기 | 5. 종료");
			System.out.println("선택하세요 : ");
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
				System.out.println("잘못된 입력입니다.");
			
			}
		}
		
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("계좌번호를 입력하세요 : ");
		String ano = sc.next(); // sc.nextLine() : 한 문장 단위(엔터 기준) / sc.next() : 단어 단위(공백 기준)
		
		System.out.println("계좌주를 입력하세요 : ");
		String owner = sc.next();
		
		System.out.println("입금할 금액을 입력하세요 : ");
		int balance = sc.nextInt();
		
		Account acc = new Account(ano, owner, balance);
		accountArray[accNum++] = acc; // accountArray 변수 선언할 때 heap에 할당해놓은 메모리 공간에 생성한 Account 객체를 실제로 연결해주는 것!
		
		System.out.println("계좌생성을 완료했습니다. 계좌번호 : " + acc.getAno() + ", 계좌주 : " + acc.getOwner() + ", 잔액 : " + acc.getBalance());
	}
	
	private static void showAccountList() {
		if (accNum == 0) {
			System.out.println("생성된 계좌가 없습니다");
		}
		for (int i = 0; i < accNum; i++) {
			System.out.println("계좌번호 : " + accountArray[i].getAno() + ", 계좌주 : " + accountArray[i].getOwner() + ", 잔액 : " + accountArray[i].getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("입금할 계좌를 입력하세요 : ");
		String ano = sc.next();
		
		System.out.println("입금할 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		Account acc = findAccount(ano);
		if (acc == null) {
			System.out.println("잘못된 계좌번호입니다. 입금에 실패했습니다.");
		}
		else {
			acc.deposit(money);
			System.out.println("입금에 성공했습니다. 계좌번호 : " + acc.getAno() + ", 현재 잔액 : " + acc.getBalance());
		}
	}
	
	private static void withdraw() {
		System.out.println("출금할 계좌를 입력하세요 : ");
		String ano = sc.next();
		
		System.out.println("출금할 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		Account acc = findAccount(ano);
		if (acc == null) {
			System.out.println("잘못된 계좌번호입니다. 출금에 실패했습니다.");
		}
		else {
			boolean success = acc.withdraw(money);
			if (success) {
				System.out.println("출금에 성공했습니다. 계좌번호 : " + acc.getAno() + ", 현재 잔액 : " + acc.getBalance());
			}
			else {
				System.out.println("잔액이 부족합니다. 출금에 실패했습니다.");
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
