package ExceptionHandling;

public class Example4 {
	
	public static void main(String[] args) {
		
		try
		{
			String name=null;
			System.out.println(name.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Code After Exception");
	}

}
