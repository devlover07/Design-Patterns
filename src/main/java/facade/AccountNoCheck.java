package facade;

public class AccountNoCheck {
	private int accountNo = 123456789;

	public int getAccountNo() {
		return accountNo;
	}
	
	public boolean accountActive(int accountNo) {
		if(accountNo == getAccountNo()) {
			return true;
		} else {
			return false;
		}
	}
	
}
