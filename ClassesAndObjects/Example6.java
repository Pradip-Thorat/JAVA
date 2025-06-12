package ClassesAndObjects;

public class Example6 {
	
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		
		System.out.println("===========");
		
		System.out.println(Counter.count);
		
		System.out.println("===========");
		
		A207 s1=new A207(101,"Animesh");
		A207 s2=new A207(102,"Prashant");
		A207 s3=new A207(103,"Rushank");
		
		System.out.println(s1.course);
		System.out.println(s2.course);
		System.out.println(s3.course);
		
//		A207.course="SQL";
		A207.changeCourse("SQL");
		
		System.out.println(s1.course);
		System.out.println(s2.course);
		System.out.println(s3.course);
		
		
	}

}
