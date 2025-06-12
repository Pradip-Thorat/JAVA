package ClassesAndObjects;

class B
{
	boolean isEven(int n)
	{
	return n%2==0;
	}
	
	boolean isPrime(int n)
	{
		int count=0;
		for(int i=2;i<+n/2;i++)
		{
			if(n%i==0)
				count++;
		}
		return count==0 && n!=1;
	}
}

public class Example3 {
	
	public static void main(String[] args) {
		
		B obj=new B();
//		boolean ans=obj.isEven(5);
//		System.out.println(ans);
		
		if(obj.isEven(50))
			System.out.println("Even");
		else 
			System.out.println("Odd");
			
		System.out.println(obj.isEven(90));
		
		System.out.println("=======================================");
		
		System.out.println(obj.isPrime(10));
		
		for(int i=1;i<=100;i++)
		{
			if(obj.isPrime(i))
				System.out.println(i);
		}
		
	}

}
