package acc;

public class PolinoTest2 {
	
	static Account[] accs = new Account[100];
	static int cnt;
	
	static void addAccount (Account acc) {
		accs[cnt++] = acc;
	}
	
	static void allAccountInfo() {
		for (int i = 0; i < cnt; i++) {
		if (!(accs[i] instanceof Account)) {
				System.out.println(accs[i].info());
			}
		}
	}
	
	static void allSpecialAccountInfo() {
		for (int i = 0; i < cnt; i++) {
			if(accs[i] instanceof Account) { // 스페셜 어카운트만 가지고 오겠다 Account를 쓴다면 전부다 가져오게된다
				System.out.println(accs[i].info());
			}
		}
	}
	static void deposit(String id, int money) {
		Account acc = searchAccByID(id);
		if(acc == null) {
			System.out.println("xmffu");
			return;
		}
		acc.deposit(money);
//		for (int i = 0; i < cnt; i++) {
//			if(accs[i].id.equals(id)) {
//				accs[i].balance += money;
//			}
//		}
	}
    static Account searchAccByID(String id) {
    	Account acc = null;
    	for (int i = 0; i < cnt; i++) {
			if(accs[i].id.equals(id)) {
				acc = accs[i];
				break;
			}
			
		}return acc;
	}
    
    static void withdraw(String id, int money) {
    	Account acc = searchAccByID(id);
    		if(acc == null) {
    			System.out.println("계좌번호가 틀립니다");
    			return;
    		}
    		acc.withdraw(money);
    }
    

	public static void main(String[] args) {
		Account acc1 = new Account("1001", "hong", 100000);
		SpecialAccount acc2 = new SpecialAccount("1002", "go", 200000, "VIP");
		SpecialAccount acc3 = new SpecialAccount("1003", "ha", 100000, "Gold");

		accs[cnt++] = acc1;
		accs[cnt++] = acc2;
		accs[cnt++] = acc3;
		
//		addAccount(acc1);s
//		addAccount(acc2);
//		addAccount(acc3);
//		
		allAccountInfo();
		
		deposit("1001", 10000);
		deposit("1002", 10000);
		deposit("1003", 10000);
		
		allSpecialAccountInfo();

	}
}
