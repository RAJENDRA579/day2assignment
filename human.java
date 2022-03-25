
public class human {

	public static void main(String[] args) 
	{
		Person h=new Person();
		h.call();
		h.eating("biryani");
		h.beat(10);
		int p=h.run();
	}
}

	class Person
	{
		void call()
		{
			System.out.println("calling you");
		
		}
		void eating(String food)
		{
			System.out.println("i had  :"+food +"aslunch");
		}
		int beat(int x)
		{
			System.out.println("he had strong hit on face: " +10+ "times");
			return x;
		}
		int run()
		{
			int x=10;
		System.out.println("he is running " +x+ "miles times daily" );
		return 10;
		}
	}

