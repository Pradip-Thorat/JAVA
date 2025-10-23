package Abstraction;

@FunctionalInterface
interface K
{
	int add(int a, int b);
}

interface J
{
	int square(int n);
}

interface L
{
	int factorial(int n);
}

public class Example9 {
	
	public static void main(String[] args) {
		
		K k=(a,b)->a+b;
		int ans = k.add(10, 10);
		System.out.println(ans);
		System.out.println(ans>100);
		
		J j=(n)->n*n;
		int ans1 = j.square(10);
		System.out.println(ans1);
		
		L l=(n)->{
			int fact=1;
			for(int i=1;i<=n;i++)
				fact=fact*i;
			return fact;
		};
		int ans2 = l.factorial(5);
		System.out.println(ans2);
		
	}

}
