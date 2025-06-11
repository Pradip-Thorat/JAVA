package Loops;

import java.util.Scanner;

public class LoopExample13 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int primeCount=0;
		for(int n=1;n<=100;n++)
		{
			int count=0;
			for(int i=2;i<=10;i++)
			{
				if(n%i==0)
					count++;
			}
			
			if(count==0 && n!=1)
			{
				System.out.println(n);
				primeCount++;
			}
		}
		
		System.out.println("Total Prime Numbers "+primeCount);
	}

}
