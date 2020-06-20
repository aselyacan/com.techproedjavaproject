package day04Operators;

import java.util.Scanner;

public class ModulosHomework2 {

	public static void main(String[] args) {		
		
		
		//4 Basamakli bir dogal sayinin rakamlari toplamini bulalim.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("1234 gibi  4 basamakli bir dogal sayi giriniz.");
		
		int num=scan.nextInt();
		int a=num/1000;
		int b=num/100%10;
		int c=num/10%10;
		int d=num%10;
		
		System.out.println("Rakamlarin toplami"+(a+b+c+d));
		
		// Kullanicinin giridigi  3 basamakli sayinin ilk ve son rakaminin toplamini veren program 
		
		
		Scanner scan1=new Scanner(System.in);
		
		System.out.println("3 basamakli bir  tam sayi giriniz");
		
		
		int zah=scan.nextInt();
		int iZah=zah%10;
		int yZah=zah/100;
		
		System.out.println(iZah+yZah);
		
		//2 tane  variablein degerlerini  yer degisitiriniz.
		
		Scanner scann=new Scanner(System.in);
		
		System.out.println("yer degistirmeden once ");
		
		double r1=scan.nextDouble();
		double r2=scan.nextDouble();
		
		double gecici=0.0;
		gecici=r1;
		r1=r2;
		r2=gecici;
		System.out.println("yer degistirdekten sonra");
		System.out.println(r1);
		System.out.println(r2);
		
		
		
		
		
		
		
		
				
		
		
		
		
		

	}

}
