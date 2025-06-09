package ConditionalStatements;

import java.util.Scanner;

public class SwitchExample{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1:English  2:Hindi  3:Marathi");
		int n=sc.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("case 1");
				break;
			case 2:
				System.out.println("case 2");
				break;
			case 3:
				System.out.println("case 3");
				break;
				
			default:
				System.out.println("Invalid Input");
		}
	}

}
