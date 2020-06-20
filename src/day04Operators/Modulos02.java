package day04Operators;

import java.util.Scanner;

public class Modulos02 {

	public static void main(String[] args) {
		
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("4 basamakli bir tamsayi giriniz");
		//Bir tamsayinin bir ler basamagini bulmak icin sayiyi 10  boleriz 
		
		int sayi=scan.nextInt();
		int sonRakam=sayi%10;
		int ilkRakam=sayi/1000;
		System.out.println(sonRakam+ilkRakam); // 1 ve  4 un toplamini bulmak amac
		
		
		
		
		
		
	}

}
