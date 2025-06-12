package Inheritance;

class A
{
	void add()
	{
		System.out.println("Add method From A class");
	}
	A()
	{
		System.out.println("Constructor From A class");
	}
	A(int n)
	{
		System.out.println("Parameterised constructor From A class "+n);
	}
}

class B extends A
{
	void sub()
	{
		System.out.println("Sub method From B class");
	}
	B()
	{
		System.out.println("Constructor From B class");
	}
	B(int n)
	{
		super(n);
		System.out.println("Parameterised constructor From B class "+n);
	}
}

public class SingleInheritanceExample {
	
	public static void main(String[] args) {
		
//		new B().add();
//		new B().sub();
		new B(10).add();
		new B(5).sub();
		
		Employee employee = new Employee(101,"Nisha",50000);
		Manager manager = new Manager(102, "Aniket", 100000, 5000);
	}
}
