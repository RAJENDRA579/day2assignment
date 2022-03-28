package accountCreation;

public class reccuringDepositAccount implements newAccount {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reccuringDepositAccount reccuringDepositAccount1=new reccuringDepositAccount(201);
		reccuringDepositAccount1.accountOpened();
	}
		int accountNumber;
		
		
		public reccuringDepositAccount(int accountNumber) {
			super();
			this.accountNumber = accountNumber;
		}
		

		@Override
		public String toString() {
			return "reccuringDepositAccount [accountNumber=" + accountNumber + "]";
		}


		public void accountOpened(){
			System.out.println("account opened:");
		}

		public void accountClose(){
			System.out.println("account closed:");
		}


}
