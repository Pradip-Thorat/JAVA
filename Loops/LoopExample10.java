package Loops;

import java.util.Scanner;

public class LoopExample10 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		for(int i=65;i<=90;i++)
			System.out.print((char)i);
		
		System.out.println();
		
		for(int i=2;i<25;i++)
			System.out.print((char)(i+65));
	}

}
