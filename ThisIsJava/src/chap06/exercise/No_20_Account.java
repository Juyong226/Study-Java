package chap06.exercise;

public class No_20_Account {

	private String accountNum;
	private String owner;
	private int balance;
	
	public No_20_Account(String accountNum, String owner, int balance) {
		setAccountNum(accountNum);
		setOwner(owner);
		setBalance(balance);
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
