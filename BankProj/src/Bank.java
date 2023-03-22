import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import acc.Account;
import acc.SpecialAccount;
import exc.BANK_ERR;
import exc.BankException;


public class Bank {
//    Account[] accs = new Account[100];
//	int cnt;
	
	TreeMap<String, Account> accs = new TreeMap<>();
	
	Scanner sc = new Scanner(System.in);
    
    int menu() throws BankException {
    	System.out.println("[KOSTA bank]");
    	System.out.println("0. 종료");
    	System.out.println("1. 계좌개설");
    	System.out.println("2. 입금");
    	System.out.println("3. 출금");
    	System.out.println("4. 계좌조회");
    	System.out.println("5. 전체계좌조회");
    	System.out.println("선택>>");
    	int sel = Integer.parseInt(sc.nextLine());
    	if ((sel > 5) || (sel < 0)){
    		throw new BankException("메뉴 선택 오류", BANK_ERR.MENU);
    	}
//    	try {
//    		sel = Integer.parseInt(sc.nextLine());
//		} catch (BankException e) {
//			System.out.println("선택한 메뉴는 없습니다");
////			
//		}
    	return sel;
    }
    
    void makeAccountMenu() throws BankException{
    	System.out.println("[계좌개설]");
    	System.out.println("1. 일반계좌");
    	System.out.println("2. 특수계좌");
    	System.out.println("선택>>");
    	int sel = Integer.parseInt(sc.nextLine());
//    	if (sel > 3 || sel < 0) {
//    		throw new BankException("메뉴선택오류", BANK_ERR.MENU);
//    	}
    	switch(sel) {
    	case 1 : makeAccount(); break;
    	case 2 : makeSpecialAccount(); break;
    	default : throw new BankException("메뉴선택오류", BANK_ERR.MENU);
    	}
    }
    
    void makeAccount() throws BankException{
    	System.out.print("[계좌 개설]");
    	System.out.print("계좌번호 : ");
    	String id = sc.nextLine(); // 입력
    	System.out.print("이름 : ");
    	String name = sc.nextLine(); // 입력
    	System.out.println("입금액 : ");
    	int money = Integer.parseInt(sc.nextLine()); // String -> int
    	
    	if(accs.containsKey(id)) {
    		throw new BankException("계좌오류", BANK_ERR.DOUBLE_ID);
    	}
    	accs.put(id, new Account(id, name, money));
    }
    void makeSpecialAccount() throws BankException{
    	System.out.print("[특수 계좌 개설]");
    	System.out.print("계좌번호 : ");
    	String id = sc.nextLine(); // 입력
    	System.out.print("이름 : ");
    	String name = sc.nextLine(); // 입력
    	System.out.println("입금액 : ");
    	int money = Integer.parseInt(sc.nextLine()); // String -> int
    	System.out.println("등급 : ");
    	String grade = sc.nextLine();
  
    	if(accs.containsKey(id)) {
    		throw new BankException("계좌오류", BANK_ERR.DOUBLE_ID);
    	}
    	accs.put(id, new SpecialAccount(id, name, money, grade));
    }
    
//    Account searchAccById(String id) {
//    	Account acc = null;
//    	for (int i = 0; i < cnt; i++) {
//			if(accs[i].getId().equals(id)) {
//				acc = accs[i];
//				break;
//			}
//		}return acc;
//    }
    
    void deposit() throws BankException {
    	System.out.println("[입금]");
    	System.out.println("계좌번호 : ");
    	String id = sc.nextLine();
    	System.out.println("입금액 : ");
    	int money = Integer.parseInt(sc.nextLine());
    
    	if(!accs.containsKey(id)) {
    		throw new BankException("계좌오류", BANK_ERR.NOT_ID);
    	} else {
    		accs.get(id).deposit(money);
    	}
    }
    void withdraw() throws BankException {
    	System.out.println("[출금]");
    	System.out.println("계좌번호 : ");
    	String id = sc.nextLine();
    	System.out.println("출금액 : ");
    	int money = Integer.parseInt(sc.nextLine());
    	

    	if(accs.containsKey(id)) {
    		throw new BankException("계좌오류", BANK_ERR.NOT_ID);
    	}else {
    		accs.get(id).withdraw(money);
    	}
    	
    }
    void accountInfo() throws BankException {
    	System.out.println("[계좌 조회]");
    	System.out.println("계좌번호 : ");
    	String id = sc.nextLine();
    	
    	
    	if(accs.containsKey(id)) {
    		throw new BankException("계좌오류", BANK_ERR.NOT_ID);
    	}else {
    		System.out.println(accs.get(id).info());
    	}
    	
    	
    }
    void allAccountInfo() {
    	System.out.println("[전체 계좌 조회]");
  
    	
//    	for (Account ba : accs.values()) {
//			System.out.println(ba.info());
//		}
//    	for (int i = 0; i < accs.size(); i++) {
//			System.out.println(accs.get(i).info());
//		}
    	
    	Iterator<Account> it = accs.values().iterator();
    	while (it.hasNext()) {
    		System.out.println(it.next().info());
    	}
    }
    
    void saveAllAccount() {
    	FileOutputStream fos = null;
    	DataOutputStream dos = null;
    	try {
    		fos = new FileOutputStream("banks.data");
        	dos = new DataOutputStream(fos);
        	dos.write(accs.size());
        	for (Account as : accs.values()) {
				if(as instanceof SpecialAccount) {
					dos.writeChar('S');
					dos.writeUTF(((SpecialAccount)as).getGrade());
				} else {
					dos.writeChar('P');
				}
				dos.writeUTF(as.getId());
				dos.writeUTF(as.getName());
				dos.writeInt(as.getBalance());
			}
    	} catch(IOException e) {
    		e.printStackTrace();
    	}finally {
			try {
				if(dos != null) dos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
    }
    void saveAllAccount_t() {
    	FileWriter fw = null;
    	BufferedWriter bf = null;
    	try {
    		fw = new FileWriter("accs.txt");
    		bf = new BufferedWriter(fw);
    		
    		for (Account as : accs.values()) {
				String V = "";
				V +=  as.getId();
				V += "," + as.getName();
				V += "," + as.getBalance();
				if (as instanceof SpecialAccount) {
					V += "," + ((SpecialAccount)as).getGrade();
				}
				bf.write(V);
				bf.newLine();
			}
    	} catch (IOException e) {
    		e.printStackTrace();
    	} finally {
    		try {
				if(bf != null) bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
    void loadAllAccount_t() {
    	FileReader fr = null;
    	BufferedReader br = null;
    	
    	String str = null;
    	try {
    		fr = new FileReader("accs.txt");
    		br = new BufferedReader(fr);
    		while((str = br.readLine()) != null) {
        		String[] arr = str.split(",");   
        		String id = arr[0];
        		String name = arr[1];
        		int balance = Integer.parseInt(arr[2]);
        		if(arr.length == 4) {
        			String grade = arr[3];
        			accs.put(id, new SpecialAccount(id, name, balance,grade));
        		}else {
        			accs.put(id, new Account(id, name, balance));
        		}
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    void loadAllAccount() {
    	FileInputStream fis = null;
    	DataInputStream dis = null;
    	try {
			fis = new FileInputStream("banks.data");
			dis = new DataInputStream(fis);
			int cnt = dis.readInt();
			for (int i = 0; i < cnt; i++) {
				char s = dis.readChar();
				if(s == 'S') {
					String id = dis.readUTF();
					String name = dis.readUTF();
					int balance = dis.readInt();
					String grade = dis.readUTF();
//					accs.values().add(new SpecialAccount(id, name, balance, grade));
					accs.put(id, new SpecialAccount(id, name, balance, grade));
				}else {
					String id = dis.readUTF();
					String name = dis.readUTF();
					int balance = dis.readInt();
//					accs.values().add(new Account(id, name, balance));
					accs.put(id, new Account(id, name, balance));
				}
			}
			
		} catch (IOException e) {
//			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
    }
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.loadAllAccount_t();
		
		while(true) {
			try {
				int sel = bank.menu();
				if (sel == 0) {
					bank.saveAllAccount_t();
					break;
				}
				if(sel == 0) break;
				switch(sel) {
				case 1 : bank.makeAccountMenu();break;
				case 2 : bank.deposit(); break;
				case 3 : bank.withdraw(); break;
				case 4 : bank.accountInfo(); break;
				case 5 : bank.allAccountInfo(); break;
				}
			} catch (NumberFormatException e) {
				System.out.println("입력 형식이 바르지 않습니다");
			} catch(BankException e) {
				System.out.println(e);
			}
		}
	}

}
