package ExceptionHandling;

class Student
{
	void finalStudent(int id) throws IdNotFoundException
	{
		if(id<=100)
			System.out.println("Student Found");
		else
			throw new IdNotFoundException("Student Not Found");
	}
}

public class Example11 {
	
	public static void main(String[] args) {
		
		try {
			new Student().finalStudent(101);
		} catch (IdNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Code After Exception");
	}

}
