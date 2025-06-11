package Loops;

public class LoopExample4 {
	
	public static void main(String[] args) {
		
		int n=567;
	
		while(n!=0)
		{
			int rem=n%10;
			System.out.println(rem+"="+rem*rem);
			n=n/10;
		}
	}

}
