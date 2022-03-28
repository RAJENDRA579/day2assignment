import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("begin main...");
		Dog dogObjRef1;
		try {
			dogObjRef1 = new Dog("Tommy",10); 
			System.out.println("dog is "+dogObjRef1);
		} catch (DogsAgeExceededException e) {
			System.out.println("Hanlder1 : exception in dogs age : " +e );
			
		} catch (DogsAgeNegativeException e) {
			System.out.println("Hanlder2 : exception in dogs age : " +e);
		} catch (DogsNameInvalidException e) {
			System.out.println("Hanlder3 : exception in dogs name : "+e );
		}
	}
		
/*
		// TODO Auto-generated method stub
		System.out.println("line1");
		System.out.println("line2");
		System.out.println("line3");
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("enter value of x:");
			int x= scan.nextInt();
			
			System.out.println("enter value of y:");
			int y= scan.nextInt();
			int z=x/y;
			//String Str1="rajendra";
			//System.out.println("UPPER CASE IS:"  +Str1.toUpperCase());
			System.out.println("value of x:"+x);
			System.out.println("value of y:"+y);
			System.out.println("value of z:"+z);
		}	
		catch(InputMismatchException e) {
			System.out.println("enter number only.....");
			
		}
		catch(ArithmeticException e) {
			System.out.println("denominator must be number always");
			
		}
		catch(RuntimeException e) {
			System.out.println("runtime error is:");
			
		}
		catch(Exception e) {
			System.out.println("");
		}		
						
	}
	*/
}



class DogsAgeExceededException extends Exception
{
	DogsAgeExceededException(String str) {
		super(str);
	}
}
class DogsAgeNegativeException extends Exception
{
	DogsAgeNegativeException (String str) {
		super(str);
	}
}
class DogsNameInvalidException extends Exception
{
	DogsNameInvalidException (String str) {
		super(str);
	}
}


class Dog{
	String name;
	int age;
	public Dog(String name, int age) throws DogsAgeExceededException,DogsAgeNegativeException,DogsNameInvalidException{
		super();
		this.name = name;
		this.age = age;
	

	if (age>14)
	{
		//System.out.println("Dog age should not be more than 14:");
		throw new DogsAgeExceededException("Dogs age cannot exceed 14");
	}
	else if(age<0)
	{
		//System.out.println("dog age never be in negative");
		throw new DogsAgeNegativeException("Dogs age cannot be negative");

	}
	else {
		this.age = age;
		
	}
	if(name.matches("[a-zA-Z]+")) {
		//System.out.println("name should be in alphabets only");
		this.name = name;
	}
		else{
		throw new DogsNameInvalidException("Dogs name should be alphabetical only");
	}
	System.out.println("Dog()...FINSHED....");
	}

	@Override
	public String toString() {
		return "dog [name=" + name + ", age=" + age + "]";
	}
}

