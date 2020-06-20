package day23date;

import java.time.LocalDate;

public class Date02 {

	public static void main(String[] args) {
		// Dat Manipulation (Date uzerinden degisklikler  yapmak
		
		LocalDate date=LocalDate.now();// su anin tarihi
		
		date.plusDays(1);//  1 ekleyereke  yarinin tarihi
		
		System.out.println(date);// 2020-05-21
		
		System.out.println(date.plusDays(3));// 2020-05-24 3 gun fazla 
		
		System.out.println(date.plusDays(13));// 13 gun eklendi 2020-06-03 oldu 
		
		System.out.println(date.plusDays(-1));// 2020-05-20  ama bu cok kullanilmaz 
		
		System.out.println(date.plusWeeks(2));// iki hafta ilave edildi 
		
		System.out.println(date.plusMonths(2));// iki  ay  ilave  edildi 
		
		System.out.println(date.plusYears(2));// 2 yil ilave edildi 
		
		//  cikarmak icin  date.minusWeeks or  minuseYears methodu kullanilir 
		
		System.out.println(date.minusDays(3));
		System.out.println(date.minusWeeks(4));
		System.out.println(date.minusMonths(3));
		System.out.println(date.minusYears(5));
		
	}

}
