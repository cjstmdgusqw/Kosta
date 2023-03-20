package exc;

public class BankException extends Exception {
//	public static final int DOUBLE_ID = 100;
//	public static final int WITHDRAW = 101;
//	public static final int DEPOSIT = 102;
//	public static final int MENU = 103;
//	public static final int ACC_MENU = 104;
	BANK_ERR errCode;
	
	public BankException(String message, BANK_ERR code) {
		super(message);
		errCode = code;
	}
	
	

	@Override
	public String toString() {
		String errMessage = getMessage() + ":";
		switch(errCode) {
		case NOT_ID : errMessage += "계좌번호가 없습니다"; break;
		case DOUBLE_ID: errMessage += "계좌번호가 중복됩니다"; break;
		case WITHDRAW: errMessage += "잔액이 부족합니다"; break;
		case DEPOSIT : errMessage += "입금액이 부족합니다"; break;
		case MENU : errMessage += "선택하신 메뉴는 없습니다."; break;
		case ACC_MENU: errMessage+="계좌종류를 잘못 선택했습니다"; break;
		}
		
		return errMessage;
	}
}
