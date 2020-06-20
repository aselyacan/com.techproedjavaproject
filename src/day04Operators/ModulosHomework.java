package day04Operators;

import java.util.Scanner;

public class ModulosHomework {

	public static void main(String[] args) {
		// Kullanicinin girdigi basamakli sayinin il ve son rakaminin toplamini ekrana yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dort Basamakli bir sayi  giriniz");
		
		int say=scan.nextInt();
		
		int ilkRakam=say/1000;
		int sonRakam=say%10;
		
		System.out.println("ilkRakam"+ilkRakam);
		System.out.println("sonRakam"+sonRakam);
		System.out.println("sayilarin toplami"+(ilkRakam+sonRakam));
		
		
		// say1 ve say2 adli iki  int degeri olusturunuz ve  bunlarin degerlerini  yer degistiriniz
		
		int say1=23;
		int say2=14;
		
		System.out.println("once Swap....");
		System.out.println("say1"+say1);
		System.out.println("say2"+say2);
		
		
		int borc=0;
		borc=say1;
		say1=say2;
		say2=borc;
		
		System.out.println("say"+say1);
		System.out.println("say"+say2);
		
		
		// Kullanincin girdigi  4 basamakli sayinin  tüm rakamlarinin toplamini  ekrana  yazdiran bir program yaziniz
		
		
		
		
		
		
		
		
		
		

	}

}
