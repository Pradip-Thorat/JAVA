package ExceptionHandling;

public class Example9 {
	
	public static void main(String[] args) {
		
		int n=89;
		if(n<100) throw new NullPointerException("Exception occured");
		
		System.out.println("Code after if block");
	}

}
