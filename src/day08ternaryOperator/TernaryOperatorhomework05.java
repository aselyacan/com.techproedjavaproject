package day08ternaryOperator;

import java.util.Scanner;

public class TernaryOperatorhomework05 {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("lutfen bir tamsayi giriniz");
	
	int num=scan.nextInt();
	
	String result= (num>99 && num<1000) ? "Uc basamakli" : ( num%2==0)  ?  "uc basamakli olmayan bir c sayi":"3 basamakli olamayan tek sayi ";
	
	System.out.println(result);
	
	///////////////////kare ve dikdorgern sorusu 
	
	Scanner scann1=new Scanner(System.in);
	
	System.out.println("en ve boy giriniz");
	
	double en=scann1.nextDouble();
	double boy=scann1.nextDouble();
	
	String resullt= en==boy ?  "kare" : "dikdortgen ";
	
	System.out.println(resullt);
	
	///year hesaplamasi ternary ile 
	
	Scanner year=new Scanner(System.in);
	
	System.out.println("Lutfen bir yil giriniz ");
	
	int yil=scan.nextInt();
	
	String sonuc= yil%100==0 && yil%400==0 ? "Artik yil" : "artik olmayan yil ";
	
	System.out.println(sonuc);
	
	}

}
