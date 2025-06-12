package Inheritance;

class P
{
	void add()
	{
		System.out.println("Addition");
	}
}

class Q extends P
{
	void sub()
	{
		System.out.println("Substraction");
	}
}

class R extends Q
{
	void mul()
	{
		System.out.println("Multiplication");
	}
}

class S extends R
{
	void div()
	{
		System.out.println("Division");
	}
}
public class MultiLevelInheritanceExample {

	public static void main(String[] args) {
		
		S s = new S();
		s.add();
		s.sub();
		s.mul();
		s.div();
		
		SchoolStudent schoolStudent = 
				new SchoolStudent(101,"Nisha","A326670");
		
		CollegeStudent collegeStudent = 
				new CollegeStudent(102,"Aniket","A326671",
						"D Y PATIL College", "DYP123");
		JobPerson jobPerson = 
				new JobPerson(103,"Akansha","A326672",
						"G V ACHARYA College","GVA1234",
							"MGL LTD","MGL12345");
		
	}

}
