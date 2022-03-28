package accountCreation;

public class termDepositAccount implements newAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		termDepositAccount termDepositAccount1=new termDepositAccount(301);
		termDepositAccount1.accountOpened();
	}
	
	
	int accountNumber;


	public termDepositAccount(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "termDepositAccount [accountNumber=" + accountNumber + "]";
	}

	public void accountOpened(){
		System.out.println("account opened:");
	}

	public void accountClose(){
		System.out.println("account closed:");
	}

	

}


