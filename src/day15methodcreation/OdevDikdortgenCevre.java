package day15methodcreation;

import java.util.Scanner;

public class OdevDikdortgenCevre {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.
           Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Paralelkenar ,dikdortgen ve ucgen kelimelerinden birini seciniz");
		
		String sekilIsim=scan.next().toLowerCase();
		System.out.println("iki sayi giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		alanVeCevre(sekilIsim,num1,num2);
		scan.close();
		
	}

	public static void alanVeCevre(String sekilIsmi, int num1, int num2) {
		
		
		switch(sekilIsmi) {
		
		case "paralelkenar":
			System.out.println(num1*num2+"alan=num1*num2");
			System.out.println("Cevre"+ 2*(num1+num2));
			break;
		case "dikdortgen":
			System.out.println(num1*num2+"alan=num1*num2");
			System.out.println("Cevre"+ 2*(num1+num2));
			break;
		case "ucgen":
			System.out.println((num1*num2)/2+"alan=num1*num2");
			break;
			default:
				System.out.println("Yanlis  sekil ismi girdiniz");
		}
	}
	
}
