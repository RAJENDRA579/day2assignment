
public class childTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandFather g1=new GrandFather();
		g1.farming();
		System.out.println("=======================");

		Father f1=new Father();
		f1.farming();
		f1.banking();
		
		System.out.println("=======================");

		Child c1=new Child();
		c1.farming();
		c1.banking();
		c1.coding();
		
	}

}
class GrandFather{
	GrandFather(){
		System.out.println("GrandFather() cstor..........");
	}
	void farming() {
		System.out.println("GrandFather is farming with bull");
	}
	
}


class Father extends GrandFather
{
	Father(){
		System.out.println("Father() cstor..........");
	}
	void farming() {
		System.out.println("Father is farming with Tractor");
	}
	void banking() {
		System.out.println("Father had banking facility");
	}
}


class Child extends Father{
	Child(){
		System.out.println("Child() cstor..........");
	}
	void farming() {
		System.out.println("Father is farming with Robotic Tractor");
	}
	void banking() {
		System.out.println("Child is having NetBanking facility");
	}
	void coding() {
		System.out.println("child know how to write code");
	}
}

