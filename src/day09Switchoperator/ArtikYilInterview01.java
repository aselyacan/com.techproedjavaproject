package day09Switchoperator;

import java.util.Scanner;

public class ArtikYilInterview01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ArtikYilTernaryInterview
         4:13
          Kullanıcıdan bir yıl girmesini isteyin, yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil”
          
          
          Ternary  medthodu ---
        yazdırın.
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("yil girininiz");
		int year=scan.nextInt();
		
		String result=(year%100==0) ? (year%100==0 ? "Artik yil " :"Artik yild degil") : (year%4==0 ? "Artik yil ": "Artik yil degil " );
		
		System.out.println(result);
		
		
	}

}
