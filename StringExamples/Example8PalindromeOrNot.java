package StringExamples;

import java.util.Scanner;

public class Example8PalindromeOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String original = sc.next();
		
//		Palindrome or not
		String reversed="";
		
		for(int i=original.length()-1;i>=0;i--)
			reversed=reversed+original.charAt(i);
		System.out.println(reversed);
		
		if(original.equalsIgnoreCase(reversed))
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
	}

}
