package Java_Review_Turkisch;

import java.util.Scanner;

public class day03SaatveSantekrar {

	public static void main(String[] args) {
		
		
		// Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		Scanner scan=new Scanner(System.in);
	    
		String amOrpm="";
		int saat,dakika,saniye;
		
		System.out.println("lutfen  saat dakika ve saniye giriniz ");
		
		saat=scan.nextInt();
		dakika=scan.nextInt();
		saniye=scan.nextInt();
		amOrpm=scan.nextLine();
		
		System.out.println(+saat+":"+dakika+":"+saniye+":"+amOrpm );
		
		
		
		
	}

}
