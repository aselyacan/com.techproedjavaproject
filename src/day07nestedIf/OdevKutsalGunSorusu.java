package day07nestedIf;

import java.util.Scanner;

public class OdevKutsalGunSorusu {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("gun giriniz");
		
		String gun=scan.next();
		
		if ( gun.equalsIgnoreCase("Cuma")     ) { // equalsIgnoreCase() buyuk kucuk  harf  dikkate almadan esitligie  bakar
			
			//equalsIgnoreCase()  icin cuma=Cuma=CUMA=CumA ayni kabul edilir
			
			System.out.println("Muslumanlar icin Kutsal gun");
		}else if (gun.equalsIgnoreCase("Cumartesi") ) {
			System.out.println("Yahudiler icin Kutsal gun");
		}else if (gun.equalsIgnoreCase("Pazar")   ) {
			System.out.println("Hristiyanlar icin Kutsal gun");
		}else {
			System.out.println("Kutsal gun degil ");
		}
		
		
	}

}
