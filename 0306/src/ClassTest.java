class Account{
	String id;
	String name;
	int balance;
	Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	void deposit(int num){
		balance += num; // void 는 return을 필요로하지 않은상태에서메서드로 쓰고
		// int, boolean같은형태는 return이 나옴으로써출력을 강행한다.
	}
	
	void withdraw(int money) {
		balance -= money;
	}
	
	String info() {
		return "계좌번호 : " + id + ", 이름 : " +  name + ", 잔액 : " + balance;
	}
}

public class ClassTest {
	static Account[] accs = new Account[100]; // main에서 쓰기위해서 static 를 달아주기로 한다
	
	static int cnt;
	
	static void makeAccount(String id, String name, int balance) {
		accs[cnt++] = new Account(id, name, balance);
	}
	
	static void makeAccount(Account acc) {
		accs[cnt++] = acc;
	}
	
	static Account searchAccById(String id) {
		Account acc = null;
		for (int i = 0; i < cnt; i++) {
			if(accs[i].id.equals(id)) {
				acc = accs[i];
				break;
			}
		}
		return acc;
//		for (int i = 0; i < cnt; i++) {
//			if(accs[i].id.equals(id)){
//				return accs[i];
//			}
//		}
//		return null;
	}
	
	static void allAccountInfo() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(accs[i].info());
		}
	}
	
	static void accountInfo(String id) {
		Account acc =  searchAccById(id);
		if (acc == null) {
			System.out.println("계좌번호가 틀립니다");
		}else {
		    System.out.println(acc.id + "," + acc.name);
		}
	}
	
	static void deposit(String id, int money) {
		Account acc = searchAccById(id);
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다");
		}else {
			acc.deposit(money);
		}
//		for (int i = 0; i < accs.length; i++) {
//			if(accs[i].id.equals(id)) {
//				accs[i].deposit(money);
//				break;
//			}
//		}
	}
	
	static void withdraw(String id, int n) {
		Account acc = searchAccById(id);
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다");
		}else{
			acc.withdraw(n);
		}
//		for (int i = 0; i < accs.length; i++) {
//			if(accs[i].id.equals(id)) {
//				accs[i].withdraw(n);
//				break;
//			}
//		}
	}
	
	public static void main(String[] args) {
		
		makeAccount(new Account("1001", "홍길동", 100000));
		makeAccount(new Account("1002", "도길동", 200000));
		makeAccount("1003", "하길동", 300000);
		
		deposit("1001", 10000);
		withdraw("1002", 10000);
		
		allAccountInfo();
		
		accountInfo("1003"); // 계좌번호 : 1003, 이름 : 허길동
		
//		Account acc = new Account("1001", "홍길동", 100000); // (id, name, balance)
//		System.out.println(acc.info());
//		
//		acc.deposit(10000);
//		System.out.println(acc.info());
//		
//		acc.withdraw(5000);
//		System.out.println(acc.info());
	}

}
