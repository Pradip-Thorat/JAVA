package Abstraction;

@FunctionalInterface
interface S
{
	void displayName(String name, int age);
}

interface T
{
	void display(int n);
}

public class Example8 {
	
	public static void main(String[] args) {
		
		S s=(name,age)->System.out.println("My name is "+name+" age is "+age);
		s.displayName("Pradip", 30);
		
		T t=(n)->{
			for(int i=1;i<=n;i++)
			System.out.println(i	);
		};
		t.display(5);
	}

}
