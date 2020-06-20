package day10Stringmethods;

import java.util.Scanner;

public class StringSoyisimSorusu1 {

	public static void main(String[] args) {
		// kullanicidan ilk  ve soy ismini alin ve  ilk ve soy ismin kac harfte olustugunu ekrana yazdirin,
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen adinizi ve soy adinizi girin");
		
		String isim=scan.nextLine();
		String soy=scan.nextLine();
		
		System.out.println(isim.length());
		
		System.out.println(soy.length());
		
		
	}
}
