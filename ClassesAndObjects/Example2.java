package ClassesAndObjects;

class A
{
	void hello()
	{
		System.out.println("Namaskar");
	}
	
	void pattern()
	{
		int n=6;
		   for(int i=1;i<=6;i++) {
			   for(int j=1;j<=i;j++)
				   System.out.print("*");
			   System.out.println();
		   }
	}
	
	void square(int n)
	{
		System.out.println("Square is "+(n*n));
	}
	
	void add(int x,int y)
	{
		System.out.println("Addition is "+(x+y));
	}
	
	int add1(int x,int y)
	{
		return x+y;
	}
}

public class Example2 {
	
	public static void main(String[] args) {
		
		A obj=new A();
		obj.hello();
		obj.pattern();
		obj.square(10);
		obj.add(10,20);
		
		int ans=obj.add1(20,20);
		System.out.println("Addition= "+ans);
		System.out.println(ans+10);
		System.out.println(ans>100);
		
		System.out.println("=================================");
		
	}
}
