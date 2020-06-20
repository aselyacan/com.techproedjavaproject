package day08ternaryOperator;

import java.util.Scanner;

public class TernaryOperatorhomework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Kullanicidan bir tamsayi  girsin ve  ekrana onun mutlak  degeri yazilsin 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir tam sayi giriniz");
		
		int num=scan.nextInt();
		
		String result= num>=0  ?  "Pozitif": "negatif bir tamsayi ";
		
		System.out.println(result);
		
		
	}

}
