package day23date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date04 {

	
	public static void main(String[] args) {
		//Date Formatini degistirmek 
		
		LocalDate  date=LocalDate.now();
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yyy");
		System.out.println(dtf.format(date)); // 21-Mai-2020 
		
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MM-yyy");
		System.out.println(dtf1.format(date.plusMonths(7)));// 21-12-2020
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yyy/M/dd");
		System.out.println(dtf2.format(date)); // 2020/05/20 
		
		
		// Time Formatini degistirme 
		
		LocalTime time=LocalTime.now();
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("HH:mm"); // HH:mm ile 24 luk saat sistemi  kucuk hh:mm ile 12 ilik saat sistemi 
		                                                             //yazdirilir
		System.out.println(dtf3.format(time));// 05:44  
		System.out.println(dtf3.format(time.plusHours(3))); // 3 saat eklenmis hali 
		
		// Baska ulkenin local zamanini almak 
		
		//System.out.println(LocalTime.now(ZoneId.of("Turkey/Istanbul")));
	}

}
