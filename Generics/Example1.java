package Generics;

public class Example1 {
	
	public static void main(String[] args) {
		
//		Autoboxing:-(Primitive to Wrapper)
		int a=99;
		Integer b=a;
		System.out.println(a);
		System.out.println(b);
		
		
//		Integer c=Integer.valueOf(a);
		
//		unboxing:-(Wrapper to Primitive)
		Integer c=100;
		int d=c;
		System.out.println(c);
		System.out.println(d);

//		int d=c.intValue();
	}

}
