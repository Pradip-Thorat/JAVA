package Inheritance;

public class Manager extends Employee {
	
	int bonus;
	
	Manager()
	{
		
	}
	
	Manager(int eid,String name,int salary,int bonus)
	{
		super(eid,name,salary);
		this.bonus=bonus;
	}
	
	void addEmployee()
	{
		System.out.println("Print");
	}
}
