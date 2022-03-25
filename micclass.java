import java.time.LocalDate;

public class micclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		SavingAccount sA1=new  SavingAccount();
		sA1.openAccount(3025, "raj", 250, LocalDate.of(2022, 03, 23), LocalDate.of(1990,02, 10));
		sA1.creditAccount(2500);
		fixedDeposit fd1=new fixedDeposit();
		
		
		
	}

}


