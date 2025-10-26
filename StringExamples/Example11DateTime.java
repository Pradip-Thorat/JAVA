package StringExamples;

import java.time.LocalDate;

public class Example11DateTime {
	
	public static void main(String[] args) {
		
//		LocalDate LocalTime LocalDateTime
//		DateTimeFormatter
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalDate customeDate = LocalDate.of(2016, 11, 10);
		System.out.println(customeDate);
		
		System.out.println(currentDate.getYear());
		
		System.out.println(currentDate.isLeapYear());
		
		System.out.println(customeDate.isLeapYear());
		
		System.out.println(currentDate.plusMonths(120));
		
		System.out.println(currentDate.plusYears(10));
		
		System.out.println(currentDate.minusDays(5));
		
		System.out.println(currentDate.getDayOfYear());
		
	}

}
