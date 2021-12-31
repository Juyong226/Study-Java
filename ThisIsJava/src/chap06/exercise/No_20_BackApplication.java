package chap06.exercise;

import java.util.Scanner;

public class No_20_BackApplication {

	private static No_20_Account[] accountArray = new No_20_Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;	
		while(run) {
			System.out.println("==============================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("==============================================");
			System.out.print("메뉴를 선택하세요. > ");
			
			int selectedNo = scanner.nextInt();
			
			if(selectedNo == 1) {
				createAccount();
			}
			else if(selectedNo == 2) {
				accountList();
			}
			else if(selectedNo == 3) {
				deposit();
			}
			else if(selectedNo == 4) {
				withdraw();
			}
			else if(selectedNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	private static void createAccount() {
		System.out.println("----------------------");
		System.out.println("계좌생성");
		System.out.println("----------------------");
		System.out.print("계좌번호: ");
		String accountNum = scanner.next();
		System.out.print("계좌주: " );
		String owner = scanner.next();
		System.out.print("초기입금액: " );
		int balance = scanner.nextInt();
		System.out.println();
		
		No_20_Account newAccount = new No_20_Account(accountNum, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 성공적으로 생성되었습니다.");
				break;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("----------------------");
		System.out.println("계좌목록");
		System.out.println("----------------------");
		
		No_20_Account account;
		for(int i=0; i<accountArray.length; i++) {
			account = accountArray[i];
			if(account != null) {
				System.out.println(account.getAccountNum() + 
						"\t" + account.getOwner() + "\t" + account.getBalance());	
			}
		}
	}
	
	private static void deposit() {
		System.out.println("----------------------");
		System.out.println("예금");
		System.out.println("----------------------");
		System.out.print("계좌번호: ");
		String accountNum = scanner.next();
		System.out.print("입금액: " );
		int deposit = scanner.nextInt();
		System.out.println();
		
		int balance;
		No_20_Account account = findAccount(accountNum);
		if(account != null) {
			balance = account.getBalance() + deposit;
			account.setBalance(balance);
			System.out.println("예금결과: " + account.getOwner() + "님의 계좌 잔액은 " + account.getBalance() + "원 입니다.");
		}
		else {
			System.out.println("찾으시는 계좌가 없습니다.");
		}
	}
	
	private static void withdraw() {
		System.out.println("----------------------");
		System.out.println("출금");
		System.out.println("----------------------");
		System.out.print("계좌번호: ");
		String accountNum = scanner.next();
		System.out.print("출금액: " );
		int withdraw = scanner.nextInt();
		System.out.println();
		
		int balance;
		No_20_Account account = findAccount(accountNum);
		if(account != null) {
			balance = account.getBalance() - withdraw;
			account.setBalance(balance);
			System.out.println("예금결과: " + account.getOwner() + "님의 계좌 잔액은 " + account.getBalance() + "원 입니다.");
		}
		else {
			System.out.println("찾으시는 계좌가 없습니다.");
		}
	}
	
	private static No_20_Account findAccount(String accountNum) {
		No_20_Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				if(accountArray[i].getAccountNum().equals(accountNum)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}
