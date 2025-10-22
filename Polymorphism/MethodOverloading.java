package Polymorphism;

//four add() methods inside class calculator, all with the same name but different parameter
class calculator
{
	int add(int a, int b)
	{
		return a+b;
	}
	float add(float a, float b)
	{
		return a+b;
	}
	float add(int a, float b)
	{
		return a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
}

public class MethodOverloading {
	
	public static void main(String[] args) {
		
		System.out.println(new calculator().add(2,2));
		System.out.println(new calculator().add(2.45f, 2.45f));
		System.out.println(new calculator().add(2, 2.45f));
		System.out.println(new calculator().add(20, 20, 20));
	
	}

}
