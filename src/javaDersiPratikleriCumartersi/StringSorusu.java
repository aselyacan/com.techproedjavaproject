package javaDersiPratikleriCumartersi;

import java.util.Scanner;

public class StringSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Kullanicidan iki farkli kelime yazsin - (String) olarak
          //Program  bu kelimeleri beraberce ekrana yazdirsin ve sonuna unlem isareti eklesin.
           /* NOT ; ---> String'leri kullanicidan almak icin ya next() veya nextLine()
              kullaniriz. next() tek kelimelik String'ler icin kullanilir.
               Space gorunce String'i almayi birakir.
                 nextLine() girilen tum String'i almak icin kullanilir.
		 */

		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("birinci kelimeyi giriniz");
		
		String kel=scan.next();
		System.out.println("ikici kelimeyi giriniz ");
		
		String kel1=scan.next();
		
		String unlem="!";
		
		String yenikel=kel+" "+kel1+unlem;
		
		System.out.println(yenikel+"yeni kelime ");
		
		
		
		
		
	}

}
