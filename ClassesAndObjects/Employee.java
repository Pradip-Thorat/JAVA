package ClassesAndObjects;

public class Employee {
	
	int id;
	String name;
	
	void printDetails(int id,String name)
	{
// This- used to refer current object properties
		this.id=id;
		this.name=name;
		
		System.out.println(this.id);
		System.out.println(this.name);
	}

}
