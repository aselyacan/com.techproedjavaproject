package day06;

import java.util.Scanner;

public class Ifstetement05 {

	public static void main(String[] args) {
		// Kullanicida  bir dikdortgenin en ve boyunu alin
		//  En ve boy  esitse  ekrana  "bu bir karedir  yazdirin"
		//en ve boy farkli ise  bu Bir dikdortgen dir yazdirin 
		
		
		Scanner scan= new Scanner(System.in);
		
		
		System.out.println("lutfen  en  giriniz");
		
	
		int en=scan.nextInt();
		
		System.out.println("lutfen boy giriniz");
		int boy=scan.nextInt();
		
		
		
		if(en==boy) {
			
			System.out.println("bu bir karedir");	
		}
		if(en!=boy) {
			
			System.out.println("bu bir diktorgendir");
			
		}	
	
		// else ==>  diger  ihtimallerin  tamami  
		
		// en ile boy  ya estiit  ya da degildir 
		
		
		if( en==boy ) {
			
			System.out.println("Bu bir  Karedir");
		} else {
			System.out.println("bu bir diktortgendir ");
			
			
			//  else  kodu kisa yazmak icin  ve  if  den sonra kullanilir 
			// hizli  olmak icin else  ifadesi  kullarnilir ...45 
		}
		
		
		// kullanicidan  password  girmesini isteyin 
		// password dogru ise  ekrana "Password dogru  "yazin 
		// password  yanlis ise  "password yanlis " yazin
		
		//Dogru password=Java2020
		
		
		Scanner scan1=new Scanner(System.in);
		
		System.out.println("Passwortunuzu giriniz");
		
		String password=scan1.next();
		// string lerin esitligini  kontrol ederken  asla "== sembolu kullanmayin" onun yerine "equals" metodu lulln
		
		// "==" string'in degerini ve  adresini  kontrol eder
		
		// "equals()" ise sadece  degerlerini  kontrol eder
		
		
		if(password.equals("Java2020") ) {
			System.out.println("password true");
		}else { 
			System.out.println("Password is  false or wrong ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
	

}
