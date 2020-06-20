 package day08ternaryOperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Kullanicidan iki sayi alin  
		 * Bu sayilar  esit ise toplamlarini  ekrana yazdirin
		 * Bu sayilar birbirinden farkli ise  carpimlarini  ekrana yazdirin....
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Iki tane sayi giriniz");
		
		double num=scan.nextInt();
		double num1=scan.nextInt();
		
		double  sonuc=  num==num1 ?   num+num1  : num*num1  ;
		
		System.out.println(sonuc);
		
		
		
		
	}

}
