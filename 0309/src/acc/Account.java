package acc;

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

	public Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int num){
		balance += num; // void 는 return을 필요로하지 않은상태에서메서드로 쓰고
		// int, boolean같은형태는 return이 나옴으로써출력을 강행한다.
	}
	
	public void withdraw(int money) {
		balance -= money;
	}
	
	public String info() {
		return "계좌번호 : " + id + ", 이름 : " +  name + ", 잔액 : " + balance;
	}

}
