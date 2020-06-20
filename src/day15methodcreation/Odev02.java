package day15methodcreation;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* )
		Sorular …
		Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise ekrana
		“Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz");
		int  num1=scan.nextInt();
		System.out.println("ikinci sayiyi giriniz");
		int num2=scan.nextInt();
		
		islem (num1,num2);
		
		
		
		
		
	}

	public static void islem(int num1,int num2) {
		
		
		String result= num1==num2 ? "sayilar esit" : num1>num2 ? "Birinci sayi buyuk":"ikinci sayi buyuk" ;
				
				System.out.println(result);
		
	}
}
