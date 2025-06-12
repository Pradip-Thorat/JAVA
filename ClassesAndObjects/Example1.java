package ClassesAndObjects;

class Student
{
	int id;
	String name;
	int marks;
	int age;
}

class Employees
{
	int eid;
	String name;
	String dept;
	int joinyear;
}

public class Example1 {
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.id=101;
		s1.name="Nisha";
		s1.marks=50;
		s1.age=18;
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println(s1.age);
		
		System.out.println("=======================================");
		
		Student s2=new Student();
		s2.id=102;
		s2.name="Priti";
		s2.marks=60;
		s2.age=19;
		
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		System.out.println(s2.age);
		
		System.out.println("=======================================");
		
		Employees e1=new Employees();
		e1.eid=1001;
		e1.name="Ankit";
		e1.dept="IT";
		e1.joinyear=2012;
		
		System.out.println(e1.eid);
		System.out.println(e1.name);
		System.out.println(e1.dept);
		System.out.println(e1.joinyear);
		
		System.out.println("=======================================");
		
	}

}
