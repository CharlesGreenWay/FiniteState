package info.finitestate.codelets;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateExample {

	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println("Current date is : " + currentDate);

		Calendar calendar = Calendar.getInstance();
		//Month starts from 0 in Date API
		int year = 2017, month = 0, dayOfMonth = 1, hourOfDay = 0, minute = 0, second = 0;
		calendar.set(year, month, dayOfMonth, hourOfDay, minute, second);
		System.out.println("New year is " + calendar.getTime());
		
		LocalDate currentJDK8Date = LocalDate.now();
		System.out.println("Current data from JDK 8 : " + currentJDK8Date);
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current time from JDK 8 : " + currentTime);
		
		//Month starts from 1 in Java 8 time package
		int monthInJDK8 = Month.JANUARY.getValue();
		LocalDateTime newYear = LocalDateTime.of(year, monthInJDK8, dayOfMonth, hourOfDay, minute);
		System.out.println("New year from JDK 8 : " + newYear);
	}
}
