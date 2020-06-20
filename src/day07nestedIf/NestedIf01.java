package day07nestedIf;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*Kullanicidan bir sayi alin 
		 * bu sayi pozitif  veya o esite  ise  9 dan buyuk mu diye kontrol edin
		 * 9dan buyuk ise ekrana  "SAYI " yazdirin
		 * 
		 * 9 den kucuk ve 0 dan buyuk esit ise ekrana "rakam yazdirin
		 * 
		 * Bu sayi  negatif ise ekrana "SAYI" yazdir 
		 * 
		 * 
		 *
		 *
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Sayi giriniz");
		
		int num=scan.nextInt();
		
		if (num>=0) {
			
			if (num>9) {
				System.out.println("sayi");
			}else if (num<=9 && num>=0) {
				System.out.println("Rakam");
			}
			
		} else if ( num<0) {
			System.out.println("SAYI");
		}
		
		
		scan.close();//scan.close(); Scanner  class ini kullandiktan sonra en allta  main methodu icinde  class in  kapatiniz
		 
		             //  *Scanner classini kapatmak icin scan.close(); yazmak yeterlidir
		
		
		
		
	}

}
