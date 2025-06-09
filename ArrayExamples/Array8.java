package ArrayExamples;

import java.util.Scanner;

public class Array8 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int r=3;
		int c=3;
		int arr[][]=new int[c][r];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println(i+" "+j+" ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("=================================");
		System.out.println("==========Transpose==============");
		
		for(int i[]:arr)
		{
			for(int j:i)
				System.out.print(j+" | ");
			System.out.println();
		}
		
		System.out.println("=====================================");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[j][i]+" | ");
			}
			System.out.println();
		}
		
		System.out.println("=====================================");
		
		boolean isSymmetric=true;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]!=arr[j][i])
				{
					isSymmetric=false;
					break;
				}	
			}
			if(!isSymmetric)
			break;
		}
		if(isSymmetric)
			System.out.println("Symmetric");
		else
			System.out.println("Not Symmetric");
		
	}
}
