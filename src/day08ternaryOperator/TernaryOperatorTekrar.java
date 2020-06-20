package day08ternaryOperator;

import java.util.Scanner;

public class TernaryOperatorTekrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       //Kullanicidan bir sayi aliniz
				//Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
				//10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
				//Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" sayi giriniz");
		
		int num=scan.nextInt();
		
		
		String  result= num >=0  ?  (num<10 ? "Rakam" :  "Pozitif sayi") : "negatif";
		
		System.out.println(result);
		
	}
	
	

}
