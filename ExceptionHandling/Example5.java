package ExceptionHandling;

import java.util.Scanner;

public class Example5 {
	
	public static void main(String[] args) {
		
		int a[]= {12,34,56};
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		try
		{
			System.out.println(5/n);
			System.out.println(a[n]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("Code After Exception");
		
	}

}
