package day10Stringmethods;

import java.util.Scanner;

public class StringMethodUlkesorusu1 {

	public static void main(String[] args) {
		// Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, Ingiltere ise
		//ekrana UK, Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın.
	
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("ulke  adi giriniz.");
		
		
		String ulke=scan.nextLine().toLowerCase();
		
		
		
		//String land=ulke.substring(0,2).toUpperCase()+ulke.substring(2);
		
		//System.out.println(land);
		
		switch (ulke) {
	
	case "Amerika":
		System.out.println("USA");
		break;
		
	case "Almanya":
		System.out.println("DE");
		break;
	case "Ingiltere":
			System.out.println("UK");
		break;
	
	default:
		System.out.println("NA");
		}
		
				
		
		
		
		
		
		

	}

}
