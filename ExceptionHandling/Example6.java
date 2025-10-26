package ExceptionHandling;

public class Example6 {
	
	public static void main(String[] args) {
		
		System.out.println("Code Before Exception");
		
		try
		{
			System.out.println(5/0);
		}
		catch(IndexOutOfBoundsException e) 
		{
			System.out.println("Exception handled");
		}
		finally 
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("Code After Exception");
	}

}
