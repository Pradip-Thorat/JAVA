package ArrayExamples;

import java.util.Scanner;

public class Array4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]= {10,20,60,40,50};
		
		for(int i:a)
			System.out.println(i*i);
		
		System.out.println("=====================================");
		
		for(int i:a)
		{
			if(i>10)
				System.out.println(i);
		}
			
		System.out.println("====================================");
		System.out.println("==================count==================");
		
		
		int count=0;
		for(int i:a)
		{
			if(i>10)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count:"+count);
		
		System.out.println("===================================");
		System.out.println("=================sum=================");
		
		int sum=0;
		for(int i:a)
			sum=sum+i;
		System.out.println("sum is "+sum);
		
		System.out.println("===================================");
		System.out.println("================greatest==================");
		
		// {10,20,60,40,50}  Greatest=60
		int max=a[0];
		for(int i:a)
		{
			if(max<i)
				max=i;
		}
		System.out.println("MAX:"+max);
		
		System.out.println("===================================");
		System.out.println("================smallest==================");
		
		// {10,20,60,40,50}  smallest=10
		int min=a[0];
		for(int i:a)
		{
			if(min>i)
				min=i;
		}
		System.out.println("MIN:"+min);
		
		System.out.println("===================================");
		System.out.println("================average==================");
		
		System.out.println("AVG:"+(sum/a.length));
		
		

	}

}
