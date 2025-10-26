package ExceptionHandling;

public class Example1 {
	
	public static void main(String[] args) {
		
		System.out.println(5/1);
		System.out.println(5/1);
		System.out.println(5/1);
		System.out.println(5/1);
		try {
			System.out.println(5/0);
		}
		catch (ArithmeticException e) {
			System.out.println("You cannot divide number by zero");
		}
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}

}
