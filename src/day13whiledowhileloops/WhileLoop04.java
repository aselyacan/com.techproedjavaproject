package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kullanicinin girdigi  sayi icin carpim  tablosunu ekrana  yazdirin 
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Carpim tablosunu  gormek icin bir sayi  giriniz ");
		
		int num=scan.nextInt();
		
		System.out.println("For Loop ile  cozum");
		
		
		for (int i=1; i<11; i++) {
			
			System.out.println(num+"x"+i+"="+(num*i));
		}
		
		
		System.out.println("While Loop ile cozum");
		
		int num1=1;
		while(num<11) {
			
			System.out.println(num+"x"+num1+"="+(num*num1));
			
			num1++;
			
			
		}
		
		
		
		
	}

	
	
	
}