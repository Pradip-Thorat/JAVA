package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class A
{
	public void readFile() throws FileNotFoundException
	{
		new FileInputStream("abc.txt");
	}
}
/*
 *What does throws FileNotFoundException mean?
	The throws keyword tells Java:
		“This method might cause this specific checked exception, and I’m not handling it here. 
		Whoever calls me must handle it.”
	So, instead of handling inside readFile(), class A declares it.
	That means — main() method (the caller) must handle it using a try–catch.
 */

public class Example8 {
	
	public static void main(String[] args) {
		
		A a = new A();
		try
		{
			a.readFile();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Code After Exception");
	}

}
