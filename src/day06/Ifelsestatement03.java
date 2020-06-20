package day06;

import java.util.Scanner;

public class Ifelsestatement03 {

	public static void main(String[] args) {


		
		
		// Kullanicidan alacagi  urun miktarini  ve fiyatini  alalim
		// Eger kullanici  1000 den fazla urun alirsa %20  idirim yapan
		//ve kullanicinin  odeyecegi  toplam fiyati ekrana yazdirin
		//eger kullanici 1000 den az veya  1000 urun alirsa  idirim yapmayin
		// ve kullanicinin odeyecegi  toplam fiyati ekrana  yazdirin
		//para konularinda "double"kullanalim  
		/*
		 * ornek: 60 tl ye %20 indrim  ==>60*80/100
		 */
		
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Urun miktari giriniz");
		
		double urun=scan.nextDouble();
		
		System.out.println("Alacaginiz urun birim  fiyatini  giriniz");
		double fiyat=scan.nextDouble();
		
		
		if (urun>1000) {
			
			System.out.println(urun*(fiyat*80)/100);
			
			} else {
				System.out.println(urun*fiyat);
			}
		

	}

}
