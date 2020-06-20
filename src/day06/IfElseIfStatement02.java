package day06;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan sinav notunu tamsayi  olarak girmesini  isteyin
		 * 
		 * Negatif girerse  ekrana "Yanlis deger girdiniz" yazdirin
		 * 
		 *  0 dan buyuk ve esit 50 den kucuk ise ekrana "kaldiniz"
		 * 
		 * 50 den buyuk ve esitse 80 den kucuk ise ekrana "gectiniz" yazdirin
		 * 
		 * 80 buyuk ve esitse 100 den kucuk ise ekrana "Tebrikler" yazdirin 
		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Sinav notunu giriniz");
		
		int not=scan.nextInt();
		
		if ( not<=0) {
			System.out.println("YANLIS  NUMARA GIRDINIZ");
		}else if(not<=50) {
			System.out.println("KALDINIZ");
		}else if (not<80) {
			System.out.println("Gectiniz ");
		}else if (not<=100) {
			System.out.println("Tebrikler");
			
		}else {
			System.out.println("100 den buyuk deger giremezseniz");
		}
		
		
	}

}
