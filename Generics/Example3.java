package Generics;

import java.util.Comparator;

@FunctionalInterface
interface B<T,R>
{
	R method(T obj);
}
/*
 * This defines your own functional interface, B, with two generic parameters:
		* T → input type
		* R → return type
 * It has exactly one abstract method, so the @FunctionalInterface annotation is valid.
 * It’s similar to Java’s built-in Function<T, R> interface (from java.util.function).
 */

class C implements Comparator<C>
{
	@Override
	public int compare(C o1, C o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
/*
 * You’ve created a class C that implements Comparator<C>.
 * The compare() method here compares two C objects — right now it just returns 0, meaning “both are equal” for all cases.
 * This part demonstrates how generics are used in built-in interfaces like Comparator.
 */

public class Example3 {
	
	public static void main(String[] args) {
		
		B<String,Integer> b=(p)->p.length();
		
		System.out.println(b.method("Hello"));  // Output: 5
		
//		Predicate
//		Consumer
//		Supplier
//		Function
//		Comparable
//		Comparator
//		List
//		Optional<T>
		
	}

}
