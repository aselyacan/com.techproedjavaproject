package day06;

import java.util.Scanner;

public class IfStatementödev1 {

	public static void main(String[] args) {
		//
		int say=13;
		
		if (say%2==0) {
			System.out.println("ciftu  sayi");
		}
		if (say%2!=0) {
			System.out.println("tek sayi ");
		}

		 //char   variable  olusuturun ve  buyuk  harf  deger  atayin
		
		
				// eger atanan deger, haftanin gunlerinden birinin  ilk harfi ise o gunleri yazdirin
				
				
				// eger atanan deger  , haftanin gunlerinden herhangi birinin ilk harfi degilse  boyle bir yok yaz
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir gun ismi giriniz");
	
		char gun=scan.next().charAt(0);
		
		
		if (gun=='C' ) {
			System.out.println("boyle bir gun yok  lutfen bask bir gun giriniz"+gun);
		}if (gun=='C') {
			System.out.println("carsamba cuma cumartesi ");
	} 
	}

}
