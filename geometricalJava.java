package associationJava;

public class geometricalJava {

	public static void main(String[] args) {
		rombus r1=new rombus(5,6,9);
		r1.draw();
		r1.area();
		r1.perimeter();
		
		rectangle rc1=new rectangle(5,6);
		rc1.draw();
		rc1.area();
		rc1.perimeter();

	}

}
abstract class geometricShape{
	int side;
	
	public geometricShape(int side) {
		super();
		this.side = side;
	}

	abstract void draw();
}
class rombus extends geometricShape{
	int p;
	int q;
	
	
	public rombus(int side, int p, int q) {
		super(side);
		this.p = p;
		this.q = q;
	}

	void draw() {
		System.out.println("drawing the geometrry shape:rombus");
	}
	
	void area() {
		System.out.println("caluclating area of rombus..........");
		int area=p*q;
		System.out.println("the area of rombus is:"+area);
	}
	void perimeter() {
		System.out.println("caluclating perimeter of rombus:");
		int perimeter=4*side;
		System.out.println("the perimeter of rombus is:"+perimeter);
		
	}
	
}

class rectangle extends geometricShape{
	int l;

	public rectangle(int side, int l) {
		super(side);
		this.l = l;
	}
	void draw() {
		System.out.println("drawing the geometrry shape:rectangle............");
	}
	void perimeter() {
		System.out.println("perimeter of rectangle being caluclated:");
		int perimeter=2*(l+side);
		System.out.println("perimeter of rectangle:"+perimeter);

	}
	void area(){
		System.out.println("arae of rectangle being caluclated:");
		int area=side*l;
		System.out.println("area of rectangle is :"+area);

	}
	
}

