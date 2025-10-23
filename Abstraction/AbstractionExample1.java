package Abstraction;

abstract class Bank
{
	abstract void getInterestRate();
	abstract void getLoan();
}

class SBI extends Bank
{
	void getInterestRate()
	{
		System.out.println("Interest Rate for SBI is 5.45%");
	}
	void getLoan()
	{
		System.out.println("SBI Loan");
	}
}

class ICICI extends Bank
{
	void getInterestRate()
	{
		System.out.println("Interest Rate for ICICI is 5.80%");
	}
	void getLoan()
	{
		System.out.println("ICICI Loan");
	}
}

public class AbstractionExample1 {
	
	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		sbi.getInterestRate();
		sbi.getLoan();
		
		ICICI icici = new ICICI();
		icici.getInterestRate();
		icici.getLoan();
		
		System.out.println("=================================");
		
//		For Quickly Switch
		Bank bank = new SBI();
		bank.getInterestRate();
		bank.getLoan();
		
		Bank bank1 = new ICICI();
		bank1.getInterestRate();
		bank1.getLoan();
		
	}

}
