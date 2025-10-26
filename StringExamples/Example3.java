package StringExamples;

public class Example3 {
	
	public static void main(String[] args) {
		
		String s1="Hello";
		char[] charArray=s1.toCharArray(); 
		/*The toCharArray() method converts the string into an array of characters.
		 * After this line,
				charArray = {'H', 'e', 'l', 'l', 'o'}
		 * Now, each character of the string is stored separately in an array.
		 */
		
		for(char ch:charArray)
			System.out.println(ch);
		
		System.out.println("=================================");
		
		System.out.println(s1.length());
		
		System.out.println("WELCOME".toLowerCase());
		
		System.out.println("apple".toUpperCase());
		
		s1=s1.toUpperCase();
	}

}
