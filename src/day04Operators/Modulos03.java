package day04Operators;

import java.util.Scanner;

public class Modulos03 {

	public static void main(String[] args) {
		
		//Kullanicidan   3 basamak bir sayi alin bu sayinin ve bu sayinn  rakamlari toplamini bulun.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Uc basamakli bir tamsayi giriniz");
		
		int sayi=scan.nextInt();
		
		int sonRakam=sayi%10;
		
		int v=sayi/10;
		int ortaRakam=v%10;
		int ilkRakam=sayi/100;
		
		System.out.println(sonRakam+ortaRakam+ilkRakam);
		
		//Kullanicidan 3 basamakli bir tamsayi alin bu sayinin rakamlari toplamini bulun
		
				// 3 basamakli sayilarin ilk rakamini bulmak icin sayi 100'e bolunur
				                          // 4 basamakli sayilarin ilk rakamini bulmak icin sayi 1000'e bolunur vs..
				
				
		
	
		
		
	}

}
