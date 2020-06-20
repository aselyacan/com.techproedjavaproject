package day06;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		/*
		 *Kullanicidan  6 basamakli bir sayi isteyin
		 *
		 * 0 ile de baslayabilir 
		 * Kazanma ihtimali %20, amorti ihtimali %30 olan , 
		 * Kaybetme ihtimali %50 birJackpot  icin program yaziniz
		 * 
		 * 00000-0000001-0000002.......999999-9999999==>
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 6 basamakli bir sayi giriniz 0, basta kullanilabilir");
		
		int num=scan.nextInt();
		
		if (num<200000) {
			System.out.println("Kazandinit");
		}else if (num<500000) {
			System.out.println("Tekrar deneyiniz");
		}else {
			System.out.println("Kaybettiniz");
		}
		
		
		
		
	    }
	}
 