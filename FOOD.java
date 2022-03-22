
public class FOOD 
{

	public static void main(String[] args)
	{
		FoodRestaurant f1=new FoodRestaurant();
		System.out.println("your order details are:");
		f1.selectItem("PIZZA");
		f1.itemRate(100);
		f1.itemToBeCollected(101);
		System.out.println("order will be in table after preparation");

	}
}
	
	class FoodRestaurant
	{
		int orderno;
		String item;
		float rate;
		
		void selectItem(String item)
		{
			System.out.println("Item you selected:"+item);
		}
		float itemRate(float rate)
		{
			System.out.println("rate of item is:"+rate);
			return rate;
			
		}
		int itemToBeCollected(int orderno)
		{
			System.out.println("your order no is:"+orderno);
			return orderno;
		}
	}

