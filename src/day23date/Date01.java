package day23date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {
		// Bugunun tarihini ekranan yazdiralim
		//
		
		// Bugunun tarihini  ekrana yazdiralim
		System.out.println(LocalDate.now());// 2020-05-20
		
		// Bugunun zamanini  saat, dakika , saniye ve salise olarak  ekrana  yazdiralim
		System.out.println(LocalTime.now()); //16:48:15.494
	
		//Bugunun tarihini ve zamanini  ekrana yazdiralim
	
		System.out.println(LocalDateTime.now()); //2020-05-21T01:06:01.926 T tarihle  zamani ayirmak icin konulur
		
		

		

		
		
		
		
	}

}
