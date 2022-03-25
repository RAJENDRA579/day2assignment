package assignmentproject;

public class Greeting
{

	//private static final String DISTANCE = null;

	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
		System.out.println("welcome to java develop");
		System.out.println("lets begin");
		switchonmobile();
		lasttrainfrommumbai("10:30 PM");
		int x=order();
        System.out.println(x);
		System.out.println("sum is:" +sum);
		float x=DistanceBtnMumbaiAndNerul();
		System.out.println(x);
	}

	private static int order() {
		// TODO Auto-generated method stub
		return 0;
	}

	static void switchonmobile()
	{
		System.out.println("welcome to nokia");
	}


	static void lasttrainfrommumbai(String x)
	{
		System.out.println("last train from mumbai:"+x );
	}

	static float order(String pizza) 
	{
		int price1 = 25;
		
		return price1;
	
	}
	
	static float DistanceBtnMumbaiAndNerul()
	{
		float SPEED_OF_THE_TRAIN=40.00f;
		float TIME_TO_REACH_TO_MUMBAI=90;
		float DISTANCE=SPEED_OF_THE_TRAIN*TIME_TO_REACH_TO_MUMBAI;
		return DISTANCE;
	}
	

}