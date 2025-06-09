package ArrayExamples;

import java.util.Scanner;

public class Array3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int marks[]=new int[4];
		
		for(int i=0;i<marks.length;i++)
			marks[i]=sc.nextInt();
	
		
		//marks[0]=sc.nextInt();
		//marks[1]=sc.nextInt();
		//marks[2]=sc.nextInt();
		//marks[3]=sc.nextInt();
		
		System.out.println("==============");
		
		
		for(int i:marks)
			System.out.println(i);
	}
	
}
