import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.time.LocalDate;
import java.time.LocalDateTime;

//import BankAccount.movieTicket;

public class BAKTEST 
{
	
		public static void main(String[] args) {
			
			movieTicket t1= new movieTicket();
			t1.setMovieDate(LocalDateTime.of(2022,03, 05,12, 30));
			t1.setMovieName("puspa");
			t1.setTicketCost(250);
			t1.setTicketNumber(02);
			t1.setSeatNumber(35);
			System.out.println(t1.toString());
			System.out.println("-----------------------------------");
			
			
			
			
/*	Button b1 = new Button("OK");
			Button b2 = new Button("CANCEL");
			
			TextField t = new TextField(20);
			TextArea ta = new TextArea(5,20);
			
			FlowLayout fl = new FlowLayout();
			
			Frame f = new Frame();
			f.setLayout(fl);
			
			f.add(t);
			f.add(ta);
			f.add(b1);
			f.add(b2);
			
			f.setLocation(100,400);
			f.setSize(500,800);
			f.setVisible(true);
*/
			
			/*LocalDate   sampleDate = LocalDate.of(2022, 3, 25);
			
			System.out.println("date is "+sampleDate);
			System.out.println("year   "+sampleDate.getYear());
			System.out.println("Month  "+sampleDate.getMonth());
			System.out.println("Day    "+sampleDate.getDayOfMonth());
			*/
			
			
			
			BankAccount baObj1 = new BankAccount();
			BankAccount baObj2 = new BankAccount();
			BankAccount baObj3 = new BankAccount();
			BankAccount baObj4 = new BankAccount();
			BankAccount baObj5 = new BankAccount();
			
			baObj1.setBankAccount(101, "Shashi Bamne", 90000.0f, LocalDate.of(2019, 1, 10), LocalDate.of(2000, 6, 10));
			baObj1.printBankAccount();

			baObj1.changeAccountHolderName("SHASHI BAMNE");
			baObj1.deposit(50005);
			baObj1.withdraw(15000);
			

			baObj1.printBankAccount();
			
			
			/*baObj2.setBankAccount(102, "Mayur Wankhede", 95000.0f,20);
			baObj3.setBankAccount(103, "Jyotsna Kasukurthi", 98000.0f,19);
			baObj4.setBankAccount(104, "Poornima Athre", 99000.0f,18);
			baObj5.setBankAccount(105, "Sagar Burade", 190000.0f,21);
			
			baObj1.printBankAccount();
			baObj2.printBankAccount();
			baObj3.printBankAccount();
			baObj4.printBankAccount();
			baObj5.printBankAccount();
			*/
		}

}


	//isA  hasA  usesA  producesA


	// ACCESSOR  VS MUTATOR

	class BankAccount
	{
		//DATA-MEMBER / fields  SECTION
		private int accountNumber;
		private String accountHolderName;
		private float accountBalance;
		private LocalDate accountOpeningDate;
		private LocalDate accountHolderBirthdate;
		private int age;
		
		//MEMBER-FUNCTIONS / methods SECTION
		
		void setBankAccount(int accountNumber, String accountHolderName, float accountBalance, LocalDate accountOpeningDate, LocalDate accountHolderBirthdate)
		{
			System.out.println("Setting the bank account details....");
		
			this.accountNumber = accountNumber;
			this.accountHolderName = accountHolderName;
			this.accountBalance= accountBalance;
			this.accountOpeningDate = accountOpeningDate;
			this.accountHolderBirthdate = accountHolderBirthdate;
			LocalDate todaysDate = LocalDate.now();			
			this.age = todaysDate.getYear() - accountHolderBirthdate.getYear();		
	    }
		
			void printBankAccount() 
			{
			System.out.println("Bank Account Number  : "+accountNumber);
			System.out.println("Bank Holder Name     : "+accountHolderName);
			System.out.println("Bank Account Balance : Rs."+accountBalance+"/-");
			System.out.println("Account Opening Date : "+accountOpeningDate);
			System.out.println("Account Holder DOB   : "+accountHolderBirthdate);
			System.out.println("Bank Holder's Age    : "+age+" years");
			System.out.println("the simple intrest is:" +calculateSimpleInterest());
			System.out.println("---------------------");
			}
		
		float withdraw(float amountToWithdraw)
		{
			if(amountToWithdraw>accountBalance)
			{
				System.out.println("insufficent funds:");
			}
			else
			{
			System.out.println("withdrawing...."+amountToWithdraw);
			accountBalance = accountBalance - amountToWithdraw;
			}
			return accountBalance;
			
		}
		float deposit(float amountToDeposit)
		{
			if(amountToDeposit>50000)
			{
				System.out.println("please specify the reason for deposit more than 50000:");
			}
			else
			{
				accountBalance=accountBalance+amountToDeposit;
			}
			System.out.println("Depositing...."+amountToDeposit);
			accountBalance = accountBalance + amountToDeposit;
			return accountBalance;
		}
		
		private float calculateSimpleInterest() {
			//System.out.println("Calculating simple interest....");
			float si = accountBalance * 1 * 2.5f / 100;
			return si;
		}

		void changeAccountHolderName(String newName) {
			System.out.println("changing the account holder's name to "+newName);
			accountHolderName = newName;
		}
	}
		

	
		
		class movieTicket
		{
			private int ticketNumber;
			private String movieName;
			private int ticketCost;
			private int seatNumber;
			private LocalDateTime movieDate;
			
			public void setmovieTicket(int ticketNumber, String movieName, int ticketCost, int seatNumber,
					LocalDateTime movieDate)
			{
			
				this.ticketNumber = ticketNumber;
				this.movieName = movieName;
				this.ticketCost = ticketCost;
				this.seatNumber = seatNumber;
				this.movieDate = movieDate;
			}

			@Override
			public String toString()
			{
				return "movieTicket [ticketNumber=" + ticketNumber + ", movieName=" + movieName + ", ticketCost="
						+ ticketCost + ", seatNumber=" + seatNumber + ", movieDate=" + movieDate + "]";
			}

			public int getTicketNumber()
			{
				return ticketNumber;
			}

			public void setTicketNumber(int ticketNumber)
			{
				this.ticketNumber = ticketNumber;
			}

			public String getMovieName()
			{
				return movieName;
			}

			public void setMovieName(String movieName)
			{
				this.movieName = movieName;
			}

			public int getTicketCost()
			{
				return ticketCost;
			}

			public void setTicketCost(int ticketCost)
			{
				this.ticketCost = ticketCost;
			}

			public int getSeatNumber()
			{
				return seatNumber;
			}

			public void setSeatNumber(int seatNumber) 
			{
				this.seatNumber = seatNumber;
			}

			public LocalDateTime getMovieDate() {
				return movieDate;
			}

			public void setMovieDate(LocalDateTime movieDate) {
				this.movieDate = movieDate;
			}
		}
		

	
			
			
			
			
			
			

