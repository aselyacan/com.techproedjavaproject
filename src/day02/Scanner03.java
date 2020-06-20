package day02;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
	
		
		//Kullanicidan  alinan  bir sayinin  kupunu  hesaplayan bir program yaziniz.
		//Not:a'nin küpünü :a x a a
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lutfen bir sayin giriniz");
		
		int sayi1 =scan.nextInt();
		
		int say=scan.nextInt();
		
		int say2=scan.nextInt();
		
		
		System.out.println(sayi1* sayi1* sayi1);
		
		System.out.println("karenin alani"+(sayi1*sayi1));
		
		System.out.println("Dikdörtgenin alani "+(sayi1*say));
		
		System.out.println("ucgenin cevresi " +(sayi1+say+say2));
		
		
		
		
		
		
		
	}

}
