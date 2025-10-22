package Encapsulation;

public class Example2 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEid(10);
		e1.setEname("P");
		
		System.out.println("Employee id is "+e1.getEid());
		System.out.println("Employee name is "+e1.getEname());
		
	}

}
