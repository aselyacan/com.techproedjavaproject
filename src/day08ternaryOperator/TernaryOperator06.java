package day08ternaryOperator;

import java.util.Scanner;

public class TernaryOperator06 {

	public static void main(String[] args) {
		//
		// Kullanicidan bir sayi aliniz
		// Sayi cift ise 10 bolunup bolunmedigini kontrol ediniz
		// Sayi 10 a bolunuyorsa “Wooow 10” yazdiriniz, 10 a bolunmuyorsa “Yazik 10" yazdiriniz
		// Sayi tek ise 5 e bolunup bolunmedigini kontrol ediniz
		// Sayi 5 e bolunuyorsa “Wooow 5” yazdiriniz, 5 e bolunmuyorsa “Yazik 5" yazdiriniz tek ise "WOOW 10" yazdiriniz ,  10 bolunmuyorsa  "Yazik 10" yazdiriniz
		
		
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		String    result= (num%2==0 )    ? ( num%10==0 ? "Woow 10 " : "Yazik10 ") : (num%5==0  ? "woow 5" : "yazik5");

		System.out.println(result);
		  
	}

}
