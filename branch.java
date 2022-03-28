package accountCreation;

public class branch {
	public static void main(String args[]) {
		branch branch1=new branch(3366,"komarole");
		branch1.branchDetails();
		
		
	}
		int branchCode;
		String branchName;
		
		
	public branch(int branchCode, String branchName) {
			super();
			this.branchCode = branchCode;
			this.branchName = branchName;
		}


	void branchDetails() {
		System.out.println("branchCode:"+branchCode +"branchName :"+branchName);
		
	}
}
