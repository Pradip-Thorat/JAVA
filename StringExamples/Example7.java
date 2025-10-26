package StringExamples;

public class Example7 {

	public static void main(String[] args) {
		
		String s1="****aa";
		System.out.println(s1.indexOf('a',s1.indexOf('a')+1));
		
		System.out.println("=========================================");
		
		String s2="Springboot";
		System.out.println(s2.substring(2));
		
//		java.notes.pdf
		String fileName="java.notes.pdf";
		System.out.println(fileName.substring(0,fileName.lastIndexOf('.')));
		System.out.println(fileName.substring(fileName.lastIndexOf('.')));
		
		System.out.println("=====================================================");
		
		String s3="I am learning Java";
		System.out.println(s3.replace('a', '*'));
		System.out.println(s3.replace('m', ' '));
		System.out.println("H e    llo".replace(" ", ""));
		
		System.out.println("123456789abcd".replaceAll("[a-z]", "1"));
				
	}
}
