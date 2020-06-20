package day15methodcreation;

import java.util.Scanner;

public class OdevIsimVeSoyisim1 {

	
	
	public static void main(String[] args) {
		/*
		 * Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harflerini büyük
             diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız.
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen isminizi giriniz");
		String isim=scan.nextLine();
		System.out.println("soyisiminizi giriniz");
		String soy=scan.nextLine();
		
		tamIsim(isim,soy);
		scan.close();
		
		// char  primitiv  ve  methohla kullanilmaz ...
		
	}

	public static void tamIsim(String isim,String soy) {
		
		System.out.println(isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase()+" "+soy.toUpperCase().charAt(0)+soy.substring(1).toLowerCase());
		
	}
	
	
}
