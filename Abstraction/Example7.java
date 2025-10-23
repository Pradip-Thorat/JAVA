package Abstraction;

@FunctionalInterface	//The @FunctionalInterface annotation means this interface must contain exactly one abstract method.
interface M         
{
	void show(); //The single abstract method here is show().
}					//This allows M to be used with lambda expressions.

interface N
{
	void display(); //Even though it’s not marked as @FunctionalInterface, it still qualifies as a functional interface,
}					//because it also has only one abstract method.
					//You can still use it with lambdas.

public class Example7 {
	
	public static void main(String[] args) {
		
//		Anonymous Inner Class Implementation (Old Way)
		M m = new M() {
		
			public void show()
			{
				System.out.println("Show Method");
			}
		
		};
		m.show();
		 
	// Lambda Expression(Modern Way) They’re heavily used in:Streams Collections (forEach, map, filter) Event handling (GUI, threads)		 
		 M obj=()->System.out.println("Lambda:Show");
		 /*
		    1. ( ) → No parameters (since show() has none)
			2. -> → Arrow separates parameters and body
			3. System.out.println("Lambda:Show") → Body (what executes when show() is called)
			This replaces the anonymous inner class with a single line.
		  */
		 obj.show();
		
	//	 Multi-line Lambda	 
		 M obj1=()->{
			System.out.println("Line 1");
			System.out.println("Line 2");
		 };
		 obj1.show();
		 
		 N n = new N() {
			 public void display()
			 {
				 System.out.println("Display Method");
			 }
		 };
		 n.display();
		 
		 N obj2=()->System.out.println("Lambda:Display");
		 obj2.display();
		 
		 N obj3=()->{
			System.out.println("Line 3");
			System.out.println("Line 4");
		 };
		 obj3.display();
	
	}

}
