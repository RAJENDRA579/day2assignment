import java.time.LocalDate;

public class NEWACCOUNT 
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s1 = new SavingAccount();
		s1.openAccount(201,"jhon",51000,LocalDate.of(2011, 1, 10), LocalDate.of(1990,2, 10));
		//s1.creditAccount(2500);
		//s1.withdraw(1500);
		s1.changeAccountHolderName("JHON");
		s1.printAccDetails();
		
	}
}
	class SavingAccount
	{
		int accNum;
		String accName;
		float balance;
		LocalDate accountOpenDate;
		LocalDate birthDate;
		int age;
		
	
	void openAccount(int x,String y, float z,LocalDate aod,LocalDate dob)
	{
	
			accNum=x;
			accName=y;
			balance=z;
			accountOpenDate=aod;
			birthDate=dob;
			
			LocalDate todaysDate = LocalDate.now();
			
			age = todaysDate.getYear() - dob.getYear();

			
	}
	void printAccDetails()
	{
		System.out.println("name of account holder is:"+accName);
		System.out.println("name of account number is:"+accNum);
		System.out.println("name of account balance is:"+balance);
		System.out.println("account opened date:"+accountOpenDate);
		System.out.println("date of birth of account holder is:"+birthDate);
		System.out.println("age of account holder is:"+age);


	}
	void creditAccount(float depositAmount)
	{
		System.out.println("depositing amount:" +depositAmount);
		 balance= balance + depositAmount;
		 System.out.println("available balance :" +balance);
	}
	void withdraw(float amountwithdrawn)
	{
		System.out.println("the amount withdrawn:"+amountwithdrawn);
		balance=balance-amountwithdrawn;
		System.out.println("total remaining balance::"+balance);
	}
	void changeAccountHolderName(String newName) {
		System.out.println("account holder's name chnaged to "+newName);
		accName = newName;
	}
	}
