package Loops;

import java.util.Scanner;

public class LoopExample15 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(i);
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
					System.out.print(0);
				else
					System.out.print(1);
			}
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print(0);
				else
					System.out.print(1);
			}
			System.out.println();
		}
			
	}

}
