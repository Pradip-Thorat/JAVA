package Loops;

import java.util.Scanner;

public class LoopExample1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int a=sc.nextInt();
		
		// Initialization
		int i=1;
		
		while(i<=a)//Condition
		{
			System.out.println("Hello");
			
			i++;//Increment
		}
		
	}

}
