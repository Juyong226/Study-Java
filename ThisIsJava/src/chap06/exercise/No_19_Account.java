package chap06.exercise;

public class No_19_Account {
	
	public static final int MAX_BALANCE = 1000000;
	public static final int MIN_BALANCE = 0;
	
	private int balance;
	
	public No_19_Account() {}
	
	public void setBalance(int balance) {
		if(balance > No_19_Account.MIN_BALANCE && balance < No_19_Account.MAX_BALANCE) {
			this.balance = balance;
		}
		else if(balance < No_19_Account.MIN_BALANCE) {
			System.out.println("잔고에 음수를 넣을 수 없습니다.");
		}
		else if(balance > No_19_Account.MAX_BALANCE) {
			System.out.println("잔고에 1,000,000원 이상을 한 번에 입금할 수 없습니다.");
		}
	}
	
	public int getBalance() {
		return balance;
	}
}
