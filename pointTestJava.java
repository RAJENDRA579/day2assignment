
public class pointTestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		point1D p1=new point1D();
		p1.setpoint1D(10, 20);
		p1.print1();
		p1.toString();
		System.out.println("=======================");
		
		point2D p2=new point2D();
		p2.setpoint2D(50, 20, 30);
		p2.print2();
		//System.out.println("value of the point2D is:" + p2);
		System.out.println("=======================");

		point3D p3=new point3D();
		p3.setpoint3D(100, 200, 300, 400);
		p3.print3();

	}

}
class point1D{
	int x;
	int y;
	String color;
	public void setpoint1D(int x, int y) {
		this.x = x;
		this.y = y;
		//this.color=color;
	}
	
	void print1() {
		System.out.println("the value of point x is:"+x);
		System.out.println("the value of point y is:"+y);
		System.out.println("the color of point color is:" +color);


	}
	
}

class point2D extends point1D{
	int z;

	public void setpoint2D(int x, int y,int z) {
		super.setpoint1D(x, y);
		this.z=z;
	}
	void print2() {
		super.print1();
		System.out.println("the value of point z is:"+z);

	}
	
}

class point3D extends point2D{
	int f;
	public void setpoint3D(int x, int y,int z,int f) {
		super.setpoint2D(x, y, z);
		this.f=f;
	}
	void print3() {
		super.print2();
		System.out.println("the value of point f is:"+f);
	}
	
	
}