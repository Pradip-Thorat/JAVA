package ClassesAndObjects;

public class A207 {
	
	int studentId;
	String studentName;
	static String course="WD";
	
	static {
		System.out.println("A207 Static Block");
	}
	
	static void changeCourse(String courseName)
	{
		course=courseName;
	}
	
	public A207(int studentId, String studentName) {
		
		this.studentId = studentId;
		this.studentName = studentName;
	}	
}
