package associationJava;

public class interfaceTestJava {

	public static void main(String[] args) {
	
		laptop l1=new laptop("dell");
		l1.sleeping(10,7);   l1.waking(5);
		

	}

}
interface  waking {
	
	void waking(int inwhattime);
}
interface  sleeping {
	
	void sleeping(int atwhattime,int howlong);
}
class laptop implements waking,sleeping{
	String modelName;
	
	public laptop(String modelName) {
		super();
		this.modelName = modelName;
	}
	 
	public void waking(int inwhattime) {
		System.out.println(modelName+" is waking up at..."+inwhattime);
	}
	public void sleeping(int atwhattime,int howlong) {
		System.out.println(modelName+" is sleeping at...."+atwhattime +" hours  for  "+howlong);
	}


	
}