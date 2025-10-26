package StringExamples;

import java.util.Scanner;

public class Example4ReverseString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse");
		String s =sc.next();
		
		char[] charArray = s.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--)
			System.out.print(charArray[i]);
	}

}
