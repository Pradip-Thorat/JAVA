package StringExamples;

public class Example10 {
	
	public static void main(String[] args) {
		
//		Mutable(mutability:- means the ability of an object’s state (data) to be changed after it is created.)
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		
		sb.insert(0, 'a');
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		StringBuilder stringBuilder = new StringBuilder("Bye");
		stringBuilder.append("!!!");
		System.out.println(stringBuilder);
		
//		Immutable convert to Mutable (Immutability:- means once the object is created, its state cannot be changed.)
		String s="Hello";
		StringBuilder newSb = new StringBuilder(s);
		System.out.println(newSb);
	}

}
