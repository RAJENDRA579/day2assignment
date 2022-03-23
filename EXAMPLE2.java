
public class EXAMPLE2 
{

	public static void main(String[] args)
	{
		FoodRestaurant1 f1=new FoodRestaurant1();
		System.out.println("your order details are:");
		f1.selectItem(121,"PIZZA",250);
		/*f1.itemRate(100);
		f1.itemToBeCollected(101);
		*/
		System.out.println("order will be in table after preparation");

	}
}
	
	class FoodRestaurant1
	{
		int orderno;
		String item;
		float rate;
		
		void selectItem(int x, String s, float f)
		{
			 orderno=x;
			 item=s;
		     rate=f;
		     {
		     
		   System.out.println("order no is:"+orderno +"\n" +"item selected:"+item + "\n" +"rate of item is:"+rate);
		     }
		}
		
		
		
		/*float itemRate(float rate)
		{
			System.out.println("rate of item is:"+rate);
			return rate;
			
		}
		int itemToBeCollected(int orderno)
		{
			System.out.println("your order no is:"+orderno);
			return orderno;
		}*/
		
	}

