package Loops;

import java.util.Scanner;

public class LoopExample9 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int positives=0;
		int negatives=0;
		int zeros=0;
		
		for(int i=1;i<=5;i++)
		{
			int n=sc.nextInt();
			if(n>0)
				positives++;
			else if(n<0)
				negatives++;
			else
				zeros++;
		}
		
		System.out.println("Positive Numbers :"+positives);
		System.out.println("Negative Numbers :"+negatives);
		System.out.println("Zero :"+zeros);
	}

}
