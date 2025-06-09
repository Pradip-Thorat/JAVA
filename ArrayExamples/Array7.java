package ArrayExamples;

public class Array7 {
	
	public static void main(String[] args) {
		
		int a[][]= {
					{10,20},
					{30,40},
					{50,60,70}
				   };
		System.out.println(a[0][1]);
		System.out.println(a[1][0]);
		System.out.println(a[2][2]);
		
		System.out.println("================================");
		
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		System.out.println("================================");
		
		for(int x=0;x<a.length;x++)
		{
			for(int y=0;y<a[x].length;y++)
			{
				System.out.println(a[x][y]);
			}
		}
		
		System.out.println("================================");
	}
}
