package StringExamples;

import java.util.Scanner;

public class Example5StringSwitchChoice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1:Red 2:Green 3:Purple");
		String choice = sc.next().toLowerCase();
		
		switch(choice)
		{
		case "red":
			System.out.println("Red colour selected");
			break;
			
		case "green":
			System.out.println("Green colour selected");
			break;
			
		case "purple":
			System.out.println("Purple colour selected");
			break;			
		}
	}

}
