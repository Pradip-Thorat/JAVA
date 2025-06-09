package ConditionalStatements;

public class elseifExample2 {
	
	public static void main(String[] args) {
		
		int a=100;
		int b=100;
		int c=100;
		
		
		if(a>b && a>c)
			System.out.println("a is greatest");
		else if(b>c)
			System.out.println("b is greatest");
		else if(c>b)
			System.out.println("c is greatest");
		else
			System.out.println("a b c are equal");
	}

}
