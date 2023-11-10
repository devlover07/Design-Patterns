package facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountFacade accessingBank = new BankAccountFacade(123456789, 1234);
		
		accessingBank.withdrawCash(50.0);
		accessingBank.withdrawCash(100.0);
		accessingBank.depositCash(50);
	}

}
