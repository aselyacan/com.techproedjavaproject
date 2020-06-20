package day08ternaryOperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		/*
		 * 
		 * Kullanicadan  iki sayi aliniz
		 * 
		 * Kucuk sayiyi ekrana yazdrini
		 * 
		 * 
		 */
        
		Scanner scan=new Scanner(System.in);
		
		System.out.println("iki sayi  giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		// result sonuc demek 
	    int sonuc= num1>=num2 ?  num2 : num1;
		
		System.out.println(sonuc);
		
		scan.close();
	}

}
