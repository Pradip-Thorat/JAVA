package StringExamples;

public class Example1 {
	
	public static void main(String[] args) {
		
//		Using String literal
		String s1="Hello";
		String s2="Hello";
		
//		Using new keyword
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		char ch[]= {'a','b','c'};
		String s5 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s5);
	}

}
