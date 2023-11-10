package facade;

public class BankAccountFacade {
	private int accountNo;
	private int securityCode;
	
	AccountNoCheck accountChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundsChecker;
	
	public BankAccountFacade(int accountNo, int securityCode) {
		super();
		this.accountNo = accountNo;
		this.securityCode = securityCode;
		
		accountChecker = new AccountNoCheck();
		codeChecker = new SecurityCodeCheck();
		fundsChecker = new FundsCheck();
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public void withdrawCash(double cashToDeposit) {
		if(accountChecker.accountActive(getAccountNo()) && 
				codeChecker.isCodeCorrect(getSecurityCode()) &&
				fundsChecker.haveEnoughMoney(cashToDeposit)) {
			System.out.println("Transaction Complete!\n");
		} else {
			System.out.println("Transaction failed!\n");
		}
	}
	
	public void depositCash(double cashToWithdraw) {
		if(accountChecker.accountActive(getAccountNo()) && 
				codeChecker.isCodeCorrect(getSecurityCode())) {
			fundsChecker.makeDeposit(cashToWithdraw);
			System.out.println("Transaction complete!\n");
		} else {
			System.out.println("Transaction Complete!\n");
		}
	}
}
