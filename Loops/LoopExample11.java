package Loops;

import java.util.Scanner;

public class LoopExample11 {
	
	public static void main(String[] args) {
		
		/*
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
		}
		
		if(count==0 && n!=1)
			System.out.println(n+" is prime number");
		else
			System.out.println(n+" is not prime number");
		*/
		
		/*
		int n=9;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		System.out.println("Count is "+count);
		*/
		
		// n comes in which tables
		int n=10;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			System.out.println(i);
		}
	}
}
