package Abstraction;

public class Example6 {
	
	public static void main(String[] args) {
		
		Restaurant r3 = new Restaurant() {
			public void menu()
			{
				System.out.println("R3 Menu");
			}
		};
		
		Restaurant r4 = new Restaurant() {
			public void menu() 
			{
				System.out.println("R4 Menu");
			}
		};
		
		r3.menu();
		r4.menu();
	}

}
