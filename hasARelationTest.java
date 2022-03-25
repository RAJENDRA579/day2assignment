
public class hasARelationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cse c1=new cse();
		c1.learningc();
		c1.learningjava();
		//learn lr1=new learn();
		
		//informationTech it1=new informationTech();

	}

}
class university{
	
}
class college extends university{
	
}
class engineering extends college{
	
}

class itDept {
	
}
class learning {
	
}

class lang{
	
}
class cLang{
	
}
class javalang{
	
}
class cse extends itDept{
	int cseStudentRollNo;
	String cseStudentName;
	lang clang=new lang();
	lang javalang=new lang();
	 void learningc() {
		 
		 System.out.println("im learning c lang:");
		
	 }
	 void learningjava() {
		 System.out.println("im learning java lang");
	 }

}


