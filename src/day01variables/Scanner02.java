package day01variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		
		/*Kullacini karenin bir kenar  uzunlugu girsin
		 Karenin cevresini ve alanini  ekrana yazdiralim
		 
		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
		
		int a=scan.nextInt();
		
		
		System.out.println(a+a+a+a);//40
		
		System.out.println(a*a);//100
		
		
		
	}

}
