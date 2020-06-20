package day15methodcreation;

import java.util.Scanner;

public class Odev3 {

	//  static int num=0; // klassdan sonra  instance variable olusturulur 
	
	public static void main(String[] args) {
		/*
		 * Kullanıcıya sayı girmesini söyleyin. Kullanıcının girdiği sayının rakamları toplamını ekrana
            yazdıran bir program yazın
		 */

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir sayi giriniz");
		
		int num=scan.nextInt();
		rakamToplami(num);
		
	}

	public static void rakamToplami(int num) {//  int  num  parametre dir 
		
		int sum=0;
		while (num!=0) {
			sum=sum+num%10; // son rakami almak icin 10 bolunur  % isare bolme dir 
			
			num=num/10;// while dongusunde  num mutlaka degismeli 
			
		}
		System.out.println("Rakamlar toplami"+sum);
	}
	
	
}
