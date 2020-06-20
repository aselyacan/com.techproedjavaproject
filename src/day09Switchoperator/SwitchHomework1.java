package day09Switchoperator;

import java.util.Scanner;

public class SwitchHomework1 {

	public static void main(String[] args) {
//		//Kullanicidan bir gun aliniz  
//		ege cuma gunu ise  Muslumanlar icin Kutsal  
//		eger cumartesi ise  Yahudiler icin Kutsal 
////		eger pazar ise  Hristiyanlar icn Kutsal 
	//	Aksi halde Kutsal gun degil yazdirin-
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir gun giriniz");
		String gun=scan.next();
		
		gun=gun.toLowerCase();
		
		switch (gun) {
		
		case "cuma":
			System.out.println("Muslumanlar icin Kutsal ");
			
		break;	
		
		case "cumartesi":
			System.out.println("Yahudiler icin Kutsal ");
			
		break;	
		case "pazar":
			System.out.println("Hristiyanlar icin Kutsal ");
			
		break;	
		default:
			System.out.println("Kimse icin Kutsal degil  ");
			
		break;	
		
		}
		
		
		
		
	}

}
