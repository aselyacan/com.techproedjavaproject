package day15methodcreation;

import java.util.Scanner;

public class OdevSorusu01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan sayi girmesini  soyleyin .Kullanici  sifir girdiginde   
		 * ekrana  o ana kadar girmis  oldugu  
		 * t[m sayilarin toplamini   yazdiriniz
		 * ogrnegin 5, 4, 7 , ise  5+4+7+=16 ekrana 16 yazdirin
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		int num=0;
		int sum=0;
		
		do {
			System.out.println("sAYI GIRINIZ"); // dowhile  oyun gibi seyler de cok kullaniliyor 
		
		num=scan.nextInt();
		sum=sum+num;
		
		}while(num!=0);
		
		System.out.println(sum);
		
		
		scan.close();
		
	}

}
