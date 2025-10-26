package ExceptionHandling;

public class Example2 {
	
	public static void main(String[] args) {
		
		int a[]= {12,56,45};
		
		try 
		{
			System.out.println(a[100]);
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Code");

	}		
	
}
