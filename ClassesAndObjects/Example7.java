package ClassesAndObjects;

import ClassesAndObjects.Outer.Inner;

class Outer
{
	static int a=8;
	static class Inner
	{
		void methodInner()
		{
			System.out.println("Method from Inner classes "+a);
		}
	}
}

public class Example7 {
	
	public static void main(String[] args) {
		
//		Outer outer = new Outer();
//		Inner inner=outer.new Inner();
//		inner.methodInner();
		
		Inner inner=new Outer.Inner();
		inner.methodInner();
	}

}
