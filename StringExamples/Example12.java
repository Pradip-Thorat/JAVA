package StringExamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example12 {
	
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd MMMM y EEEE");
		String formattedDate = pattern.format(currentDate);
		System.out.println(formattedDate);
		
		System.out.println("=======================================================");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		System.out.println(LocalTime.of(10, 25, 10, 9584454));
		
		System.out.println("=======================================================");
		
		System.out.println(DateTimeFormatter.ofPattern("dd MMMM y hh :: mm :: s a").format(localDateTime));
	}

}
