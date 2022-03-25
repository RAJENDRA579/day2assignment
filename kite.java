
public class kite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class kites
{
	private static int kitecount;
	private String color; //object's data
	private String owner; //object's data
	private int length;   //object's data
	private boolean flying;
	
	void kiteflight(kites x){
		
	}
	public kites(String color, String owner, int length, boolean flying) {
		super();
		this.color = color;
		this.owner = owner;
		this.length = length;
		this.flying = flying;
		++kitecount;
		
	}
	void fly() {
		System.out.println(color+"kite is flying by "+owner);
		
	}
	@Override
	public String toString() {
		return "kites [color=" + color + ", owner=" + owner + ", length=" + length + ", flying=" + flying + "]";
	}
	
	
}

