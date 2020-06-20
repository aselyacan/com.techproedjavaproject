package day04Operators;

import java.io.InputStream;
import java.util.Scanner;

public class InterviewSorusu01 {

	public static void main(String[] args) {

         
		//iki tane variable'in degerlerini yer  degistiriniz
		
		//sayi1 12, sayi2 30 ====>sayi1=30, sayi2=12 (bu isleme  Swap  denir ....)
		
		
		//1, Yol
		
		
		
		
		Scanner scan=new  Scanner(System.in);
		
		System.out.println("yerlerini degistirmek icin iki sayi giriniz");
		
		double say1=scan.nextDouble();
		double say2=scan.nextDouble();
		//1-yol
		
		double gecici=0.0;//variable olusturuken  Data Type  bir kere yazilir .
		gecici=say1;
		say1=say2;
		say2=gecici;
		System.out.println("Yer degistirdikten sonra ");
		System.out.println(say1);//30.0
		System.out.println(say2);//12.0
		System.out.println(gecici);//12.0
		
		//2.Yol 
		
	  System.out.println("yer degistirmek icin iki sayi daha giriniz");
	  
	  double sayi3=scan.nextDouble();
	  double sayi4=scan.nextDouble();
	  sayi3=sayi3+sayi4;
	  
	  sayi4=sayi3-sayi4;
	  
	  sayi3=sayi3-sayi4;
	  
	    System.out.println("Yer degistirdikten sonra ");
		System.out.println(sayi3);//30.0
		System.out.println(sayi4);//12.0
		
	  
	  
		
		
		
		
	
		
	}

}
