package accountCreation;

public class savingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		savingAccount savingAccount1=new savingAccount("rajendra","A579","7093563608",101);
		savingAccount savingAccount2=new savingAccount("Jhon","A580","9396363195",102);
		savingAccount savingAccount3=new savingAccount("Shahid","A581","9490249084",103);
		
		savingAccount1.accountOpened();
		savingAccount2.accountOpened();
		savingAccount3.accountOpened();

	}
	String name;
	String id;
	String phoneNumber;
	long accountnumber;
	
	
	
	public savingAccount(String name, String id, String phoneNumber, long accountnumber) {
		super();
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	void accountOpened() {
		System.out.println("the savingAccount for" +name +"with id:" +id  +"phonNumber:"+phoneNumber+" and accountNumber :"+accountnumber) ;
	}
	@Override
	public String toString() {
		return "savingAccount [name=" + name + ", id=" + id + ", phoneNumber=" + phoneNumber + ", accountnumber="
				+ accountnumber + "]";
	}
	
	

}

