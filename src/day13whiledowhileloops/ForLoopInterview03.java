package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterview03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kullanicidan bir sayi alin
		
		// bu sayinin  TERSINI  EKRANA YAZDIRIN 
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		String num = scan.nextLine();
		
		String ters="";
		
		
		for ( int i=num.length()-1; i>=0; i-- ) {
			
			ters=ters+num.charAt(i)+"";// char'i  string e  cevirmek isin sonuna +""  ekleyebilirsiniy 
			
		}
		
		
		System.out.println(ters);
		
	      int tersInt=Integer.valueOf(ters);
	      
	      tersInt=tersInt+2;
	      
	      System.out.println(tersInt); // 123==>321+2=323olur 
		
		
		
	}

}
