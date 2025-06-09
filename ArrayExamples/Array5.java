package ArrayExamples;

import java.util.Scanner;

public class Array5 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,30,40,50};
		
		System.out.println("Enter value");
		int value=sc.nextInt();
		int valueCount=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(value==a[i])
			{
				System.out.println(i);
				valueCount++;
			}
		}
		
		if(valueCount==0)
			System.out.println(value+" is not present in array");
	}

}
