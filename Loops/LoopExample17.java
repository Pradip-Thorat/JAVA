package Loops;

import java.util.Scanner;

public class LoopExample17 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}
		
		System.out.println("===========================================");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n||i==2||j==2||i==(n-1)||j==(n-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==n||j==1||j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}

		System.out.println("=======================================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
			{
				if(i==1||i==n||k==1||k==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print((char)(j+65));
			System.out.println();
		}
		
		System.out.println("=======================================");
		
	}

}
