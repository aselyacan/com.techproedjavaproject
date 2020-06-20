package javaDersiPratikleriCumartersi;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		
		
		/*
		  Kullanici  iki sayi girsin 
		  Program girilen sayilarin karesini ayri ayri ekrana yazdirsin //
		  
		  
		  Ayri olarak; Program girilen sayilari ayri ayri 5 ile carpimini
		  ve sonucunu ekrana yazdirsin. //
		  
		  
		  Ayri olarak; Program girilen sayilara ayri ayri 12 eklesin //
		  Ayri olarak; Program girilen sayilardan ayri ayri 5 cikarsin //
		*/
		
      
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("birinci sayi");
		int num1=scan.nextInt();
		System.out.println("ikicin sayi");
		int num2=scan.nextInt();
		
		
		int ilkkare=num1*num1;
		
		
		System.out.println(ilkkare+"kare1");
		
		int ikikare=num2*num2;
		
		System.out.println(ikikare+"kare2");
		
		
		int ilk5Carp=num1*5;
		
		System.out.println(ilk5Carp+"5ile carpim 1");
		
		int ikiCarp=num2*5;
		
		System.out.println(ikiCarp+"ikinci carpma 5 ile ");
		
		int eksay=12;
		
		int eksay1=num1+eksay;
		System.out.println(eksay1+"ilk toplam 12 ile ");
		
		int eksay2=num2+eksay;
		
		System.out.println(eksay2+"ikinci toplam ");
		
		
		int cikarSay=5;
		
		int cik1=num1-cikarSay;
		System.out.println(cik1+"cikarma 1");
		
		int cik2=num2-cikarSay;
		
		System.out.println(cik2+"cikarma2");
		
		
		
		
	}

}
