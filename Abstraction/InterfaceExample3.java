package Abstraction;

interface I1
{
	void method1();
	int method2();
}

class A implements I1
{
	public void method1()
	{
		System.out.println("Method 1 from A");
	}
	public int method2()
	{
		System.out.println("Method 2 from A");
		return 0;
	}
}

public class InterfaceExample3 {
	
	public static void main(String[] args) {
		
//		I1 obj = new A();
//		obj.method1();
//		obj.method2();
		
		new A().method1();
		new A().method2();
	}

}
