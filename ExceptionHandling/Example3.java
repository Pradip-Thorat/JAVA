package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		try
		{
			int n=sc.nextInt();
			System.out.println("Square of "+n+" is "+(n*n));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}
		
		System.out.println("Code After Exception");
	}

}
