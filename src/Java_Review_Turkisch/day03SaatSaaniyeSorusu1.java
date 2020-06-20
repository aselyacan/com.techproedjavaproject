package Java_Review_Turkisch;

import java.util.Scanner;

public class day03SaatSaaniyeSorusu1 {

	public static void main(String[] args) {
		
		// Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		
		
		
		int saat,dak,san;
		
		String amOrpm="";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("saat degeri giriniz");
		
		saat=scan.nextInt();
		
		System.out.println("dakika giriniz");
		
		dak=scan.nextInt();
		
		System.out.println("saniye giriniz");
		
		san=scan.nextInt();
		
		System.out.println("lutfen AM Ve  Pm degerini giriniz");
		
		amOrpm=scan.nextLine();
		
		System.out.println(saat+":"+dak+":"+san+":"+amOrpm);
		
		
		System.out.println("lUtfen bir sayi giriniz");
		
		Scanner sc=new Scanner(System.in);
		int say=scan.nextInt();
		
		if (say%2==0) {
			System.out.println("cift");
		}else {
			System.out.println("tek");
		}
		
	}

}
