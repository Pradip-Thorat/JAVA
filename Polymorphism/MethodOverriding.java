package Polymorphism;

class Bank
{
	void getInterestRate()
	{
		System.out.println("General Interest Rate is 5%");
	}
}

class SBI extends Bank
{
	@Override
	void getInterestRate()
	{
		super.getInterestRate();
		System.out.println("General Interest Rate is 5.45%");
	}
}

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		new SBI().getInterestRate();
		
	}

}
