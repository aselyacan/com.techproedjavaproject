package day07nestedIf;

import java.util.Scanner;

public class NestedIfStatement03 {

	public static void main(String[] args) {
		// 
		
		
//		Kullanıcıdan 5'ten buyuk bir password girmesini isteyin.
//		Girdiği password 5’e bölünüyorsa son rakamını kontrol edin.
//		Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
//		Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
//		Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Password giriniz.");
		int password = scan.nextInt();
		
		if(password < 5) {
			System.out.println("Lutfen tekrar deneyin.");
		}else if(password%5==0) {
			if(password%10==0) {
				System.out.println(password + ": 5'e bolunen cift sayidir.");
			}else{
				System.out.println(password + ": 5'e bolunen tek sayidir.");
			}
		
			}else if(password%5!=0) {
				System.out.println("Lutfen tekrar deneyin.");
		}
		
		scan.close();


	}

}
