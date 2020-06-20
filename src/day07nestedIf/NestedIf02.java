package day07nestedIf;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		// Kullanicidan  password girmesini isteyin
		/* 
		 * password  4 basamakli bir  sayi ise  cift olup olmadigini  kontorol edin
		 * 
		 * cift sayi  ise  password TAMAM ekrana yazdirin
		 * Tek sayi ise ekrana Tekrar deneyin yazdirin
		 * 
		 * Password 4 basamakli degilse  Tekrar deneyin yazdirin
		 * 
		 * 999<num<10000 kucuk 
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Password giriniz");
		
		int num=scan.nextInt();
		
		if (num>999 && num<1000 ) {
			
			if (num%2==0) { //  num%2=0  sayiyi  2 ye bol kalan 0 a esitse  sayi  cift dir
				System.out.println("Password tamam");
			}else if (num%2!=0) { // num%2!=0 sayiyi  2e  bolup kalan  sifir degilse sayi  tek sayi dir 
				
				System.out.println("Tekrar deneyin");
			}
		}else {
			System.out.println("Tekrar deneyin son");
		}
		
		
		scan.close();
		
	}

}
