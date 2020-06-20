package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		/*
		 * Saati  saniye ye  ,ml'i  kilometrye  ceviren bir program 
		 * 
		 * kilogrami  grama ceviren bir metho  yaziniz
		 * 
		 * BU method u main methodun  disinda  olusturup  main methodun icinden cagiriniz
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Birimi giriniz");
		String birim=scan.nextLine();
		
		System.out.println("Miktari giriniz");
		double miktar=scan.nextDouble();
		
		donusturucu(birim,miktar);// 10800 vermesi  lazim
		
		scan.close();
	}

	public static void donusturucu(String birim,double miktar) {
		
		switch (birim) {
		
		case"saat":
			
			System.out.println(miktar*60*60);
			
			break;
		case"mil":
			System.out.println(miktar*1.6);
			break;
		case"kilogram":
			System.out.println(miktar*1000);
			break;
		default:
			System.out.println("tekrar giriniz ve  saat , kilogram , mil disinda birim girmeyiniz  ");
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
