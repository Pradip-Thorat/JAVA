package ConditionalStatements;

import java.util.Scanner;

public class SwitchExample2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter character");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
			case 'b':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("It is vowel");
				break;
			default:
				System.out.println("It is consonant");
				
		}
		
		
		
	}

}
