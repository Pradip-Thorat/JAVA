package Abstraction;

public class Example4 {
	
	public static void main(String[] args) {
		
		Restaurant re = new R1(); //1. This is polymorphism.
					//2. re is a reference of type Restaurant (interface), but it points to an object of type R1.
					//3. You can call any method declared in the interface on re.
		re.menu();
		/*
		 Key Concept:
			1. The user of the interface doesn’t need to know how R1 implements menu().
			2. They only know that they can call menu().
			3. This is abstraction in action.
		✅ Summary of This Code
				1. Interface (Restaurant) → Defines what should be done (menu method).
				2. Implementation Class (R1) → Defines how it is done (prints "R1 Menu").
				3. Main Class (Example4) → Uses the interface reference to call the method.
		 */
	}

}
