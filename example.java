package assignmentproject;

public class example
{

	//private static final String DISTANCE = null;

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
		System.out.println("welcome to java develop");
		System.out.println("lets begin");
		switchonmobile();
		gotoplaces("mumbai", "delhi");
		float sum=findsumofgivennumbers(25,35,45,55);
		System.out.println("sum is:" +sum);
		float x=DistanceBtnMumbaiAndNerul();
		System.out.println(x);
	}

	static void switchonmobile()
	{
		System.out.println("welcome to nokia");
	}


	static void gotoplaces(String x, String y)
	{
		System.out.println("going to location:   "+x +"    and  "  +y);
	}

	static float findsumofgivennumbers(int w,int x,int y,int z) 
	{
		float sum=(w+x+y+z)/3.0f;
		return sum;
	
	}
	
	static float DistanceBtnMumbaiAndNerul()
	{
		float SPEED_OF_THE_TRAIN=40.00f;
		float TIME_TO_REACH_TO_MUMBAI=90;
		float DISTANCE=SPEED_OF_THE_TRAIN*TIME_TO_REACH_TO_MUMBAI;
		return DISTANCE;
	}
	

}