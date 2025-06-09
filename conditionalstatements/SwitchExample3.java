package ConditionalStatements;

import java.util.Scanner;

public class SwitchExample3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("1:ADD  2:SUB  3:MUL  4:DIV");
		String operation = sc.next();
		
		switch(operation)
		{
			case "ADD":
				System.out.println("Addition is "+(a+b));
				break;
				
			case "SUB":
				System.out.println("Substraction is "+(a-b));
				break;
				
			case "MUL":
				System.out.println("Multiplication is "+(a*b));
				break;
				
			case "DIV":
				System.out.println("Division is "+(a/b));
				break;
				
			default:
				System.out.println("Invalid Input");
		}
	}

}
