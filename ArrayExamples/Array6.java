package ArrayExamples;

import java.util.Scanner;

public class Array6 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int numbers[]= {1,5,12,18,19,27};
		int primecount=0;
		for(int n:numbers)
		{
			int count=0;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					count++;
			}
			if(count==0 & n!=1)
			{
				System.out.println(n);
				primecount++;
			}
		}
		System.out.println("Primecount:"+primecount);
	}

}
