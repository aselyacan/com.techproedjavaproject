package day06;

import java.util.Scanner;

public class IfelseIfstatement01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan yasini alin 
		 * yas 13 den az ise "calisamaz"  mesajinin ekrana yazdirin
		 * 
		 * yas 13  den 65 e kadar ise "calisabilir" ekrana yazdirin
		 * yas 65 den buyukse  ekrana "emekli"yazdirin
		 * 
		 * Negatif  sayi girerse  "Yas negatif olamaz  "mesaji gorsun
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("YASINIZI GIRINIZ");
		
		int yas=scan.nextInt();
		
		
		if ( yas<0) {
			System.out.println("yas negatif olamaz ");
		}
		
		else if (yas<13) {
			
			System.out.println("calisamaz");
				
		}else if (yas<=65) {
			System.out.println("calisabilir");
			
			
		}else {
			System.out.println("Emekli");
		}
		
		//Bu test type  Boundre denir  cunku  sinirlarda kiritik sayilar var Boundrey analisys
		
		
		
		
		
		
		
		
		
	}

}
