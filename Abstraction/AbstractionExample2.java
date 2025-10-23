package Abstraction;

abstract class University
{
	abstract void getGradeFormula();
	abstract void getPercentage();	
}

class EngineeringCollege extends University
{
	void getGradeFormula()
	{
		System.out.println("Grade A for above 75%");
	}
	void getPercentage()
	{
		System.out.println("Above 75% Distinction");
	}
}

class MedicalCollege extends University
{
	void getGradeFormula()
	{
		System.out.println("Grade A for above 70%");
	}
	void getPercentage()
	{
		System.out.println("Above 70% Distinction");
	}
}

public class AbstractionExample2 {
	
	public static void main(String[] args) {
		
		EngineeringCollege college = new EngineeringCollege();
		college.getGradeFormula();
		college.getPercentage();
		
	
		University university=new MedicalCollege();
		university.getGradeFormula();
		university.getPercentage();
		
		
	}

}
