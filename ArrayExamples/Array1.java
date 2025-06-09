package ArrayExamples;

public class Array1 {
	
	public static void main(String[] args) {
		
		int numbers[]= {10,20,30,40,50};
		System.out.println("Length:"+numbers.length);
		
		System.out.println("======================");
		
		System.out.println("[0]="+numbers[0]);
		System.out.println("[1]="+numbers[1]);
		System.out.println("[2]="+numbers[2]);
		System.out.println("[3]="+numbers[3]);
		System.out.println("[4]="+numbers[4]);
		
		System.out.println("======================");
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("======================");
		
		// Enhanced for loop
		
		for(int x:numbers)
		{
			System.out.println(x);
		}
	}
}
