package StringExamples;

public class Example6 {
	
	public static void main(String[] args) {
		
		System.out.println("Hello".charAt(1));
		
		String s1="Hello";
		for(int i=0;i<s1.length();i++)
			System.out.println(s1.charAt(i));
		
		System.out.println("	Hello	".trim());
		System.out.println("Welcome".indexOf('e'));
		System.out.println("Welcome".indexOf('e',2));
		System.out.println("Welcome".indexOf("come",2));
		
		System.out.println("eeeee".lastIndexOf('e'));
	}

}
