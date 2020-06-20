package day34collections;

import java.util.Arrays;
import java.util.Scanner;

public class Review01 {

	public static void main(String[] args) {
		// Kullacidan  ad ve soy adini alin 
		// 1 ad ve soy adini  console yazdirin
		// 2 sadece adini console yazdirin
		// 3 ad ve soyadinin ilk harflerini console yazdirin 
	    // 4 ad ve  soyadini tersten yazdirin 
		// 5  ad ve soy da ki  kullanlan tum karakterleri alfabatik sirayla console yazdirin 
		
		
		
		Scanner scan=new Scanner(System.in);
		
	   String ad=scan.nextLine();
	   String soyAd=scan.nextLine();
	   
	  System.out.println(ad+" "+soyAd);
	   
	  System.out.println( ad.substring(0, 1));
	  
	  System.out.println(soyAd.substring(0,1));
	  
	  System.out.println("Adiniz");
		for (int i = ad.length() - 1; i >= 0; i--) {
			System.out.print(ad.charAt(i));
		}
		
		System.out.println();
		System.out.println("Soyadiniz");
		
		for (int i = soyAd.length() - 1; i >= 0; i--) {
			System.out.print(soyAd.charAt(i));

		}
	   
		System.out.println();
		String str = ad + soyAd;
		String arr[] = str.split("");

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		StringBuilder strb=new StringBuilder(ad+" "+soyAd);  // stringbuilder ile reverse metho il tersten yazdirma 
		
		System.out.println(strb.reverse());// tersten yazdirma oldu 
		
		String tamAd=ad+soyAd; // yeni bir  string olusturuarak iki  farkli stringi  concat  yapildi ve isimler birlestirildi
		
		String harfArr[]=tamAd.split(""); // split methodu ile arra vasitasily  harfleri parcalama yapilacak 
		
		Arrays.sort(harfArr); //  siralama medodu  arrayda 
		
		System.out.println("Harfler alfabatik sirada : "+Arrays.toString(harfArr));// arra da ki karakterleri ekrana yazdirma strin methodu  
		
		
		
		///// Bugranin  cozme medthodu stringe  ad ve soyadin tersten  yazdirma  ve  ilk  harfi  alma methodu 
		
		
	    Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Please Enter Your Name and Surname");
		
		String name = scan1.nextLine().trim();
		
		System.out.println(name);
		
		String surName[] = name.split(" ");
		
		System.out.println(surName[0]);
		
		char n1 = name.charAt(0);
		char sN1 = surName[1].charAt(0);
		
		System.out.println("1 th Char in Name = " + n1);
		System.out.println("1 th Char in SurName = " + sN1);
		
		String a[] = name.split("");
		
		for(int i = name.length()-1; i>=0; i--) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		Arrays.sort(a);
		
		for(int i = 0; i < name.length(); i++) {
			System.out.print(a[i] + " ");
			
			
			
		}

		scan.close();
	}
	

}
