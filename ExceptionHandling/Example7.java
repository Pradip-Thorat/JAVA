package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example7 {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try
		{
			new FileInputStream("abcd"); //The program tries to open a file named "abcd" from the current directory.
		}								//Since the file does not exist, the constructor new FileInputStream("abcd") 
										//throws a FileNotFoundException.
		catch(FileNotFoundException e)
		{
			e.printStackTrace(); //e.printStackTrace() prints detailed error information on the console.
		}
		
		System.out.println("Code after exception");
	}
	
}
