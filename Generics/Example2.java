package Generics;

import Inheritance.CollegeStudent;

class A<Employee>
{
	void method(Employee t)
	{
		System.out.println(t);
	}
}
/*
* A<Employee> — here Employee is a type parameter, not a class name.
  It could be any valid identifier — usually, by convention, we use single capital letters like T, E, K, etc.
* So class A<T> would be a more conventional name, but Employee works fine.
* Inside the class, method(Employee t) accepts an object of that generic type.
* Whatever data type you pass when creating an object of A<...>, the compiler automatically replaces Employee with that type.
*/
public class Example2 {
	
	public static void main(String[] args) {
		
		int c=99;
		new A<Integer>().method(c); //Here Employee → Integer
									//c (which is an int) gets autoboxed to Integer. 
									//Output: 99
		
		new A<String>().method("Hello");//Here Employee → String 
										//Output: Hello
		
		new A<CollegeStudent>().method(new CollegeStudent());
		/*
		 * Here Employee → CollegeStudent
		 * The CollegeStudent object is passed.
		 * Output depends on toString() method of CollegeStudent.
		 	* If not overridden, it prints something like:
				Inheritance.CollegeStudent@6d06d69c
		 */
		
		/*
		 * Concept Highlight:
		 * This program shows type safety using generics:
		 * You can use the same class A with different data types (Integer, String, CollegeStudent).
		 * It avoids type casting and ensures compile-time checking.
		 */
	}

}
