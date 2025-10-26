package StringExamples;

public class Example2 {
	
	public static void main(String[] args) {
		
//		Using String literal
		String s1="Hello";
		String s2="Hello";
		
//		Using new keyword
		String s3=new String("Hello");
		String s4=new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		System.out.println("====================================");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println("====================================");
		
		System.out.println(s1.equals("Hello"));
		
		System.out.println(s1.equalsIgnoreCase("HELLO"));
	}

}
