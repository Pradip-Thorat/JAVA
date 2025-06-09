package ConditionalStatements;

import java.util.Scanner;

public class elseifExample {
	
	public static void main(String[] args) {
		
		// System.out.println("Hello");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1:English  2:Hindi  3:Marathi");
		int n=sc.nextInt();
		
		if(n==1)
			System.out.println("English language selected");
		else if(n==2)
			System.out.println("Hindi language selected");
		else if(n==3)
			System.out.println("Marathi language selected");
		else
			System.out.println("2Invalid Input");
	
	}

}
