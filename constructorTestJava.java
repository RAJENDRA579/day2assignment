
public class constructorTestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera c1=new Camera(10);

	}

}
class Camera {
	int cameraId;
	String cameraBrand;
	int megaPixel;
	float cost;
	
	public Camera (int megaPixel)
	{
		System.out.println("camera is constructed with:"+megaPixel);
		this.megaPixel=megaPixel;
	}
	public void setCamera(int megapixel) {
		System.out.println("the camera is constructed with");
		this.megaPixel=megapixel;
	}

	
}

