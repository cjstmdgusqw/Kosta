package acc;

import exc.BANK_ERR;
import exc.BankException;

public class Account {
	String id;
	String name;
	int balance;
	// vip 골드 실버
	// 계좌에 등급에 따라 이자를 준다?
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int money) throws BankException{
		if(money <=0) {
			throw new BankException("입금오류", BANK_ERR.DEPOSIT);
		}
//		balance += num; // void 는 return을 필요로하지 않은상태에서메서드로 쓰고
//		// int, boolean같은형태는 return이 나옴으로써출력을 강행한다.
	}
	
	public void withdraw(int money) throws BankException {
		if (balance < money){
			throw new BankException("출금오류", BANK_ERR.WITHDRAW);
		}
		balance -= money;
	}
	
	public String info() {
		return "계좌번호 : " + id + ", 이름 : " +  name + ", 잔액 : " + balance;
	}

}
