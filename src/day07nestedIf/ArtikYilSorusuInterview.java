package day07nestedIf;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		/*
		 * Kullanicidan yil girmesini isteyin
		 * Girilen yil artik yil ise  ekrana "artik yil " yazdirin
		 * girilen  yil  artik yil degil ise  ekrana "artik yil degil " yazdirin
		 * 
		 * Artik  yil 1) Yil  100 e  bolunurse  400 e de bolunmeli
		 * 
		 * 2) Yil 100 e bolunmezse 4 e bolunmeli 
		 * 
		 * 
		 */
		
		// Kullanicidan yil girmesini isteyin
        // Girilen yil artik yil ise ekrana "Artik Yil" yazdirin
        // Girilen yil artik yil degil ise ekrana "Artik Yil Degil" yazdirin.
        
        // Artik yil 1) Yil 100 e bolunurse 400 e de bolunmeli ==> 1300 artik yil degil cunku 100 e bolundugu halde 400 e bolunmuyor.
        //                                                     ==> 1200 artik yildir cunku 100 e bolunuyor ve 400 e de bolunuyor.
        //           2) Yil 100 e bolunmezse 4 e bolunmeli 
          Scanner scan=new Scanner(System.in);
         System.out.println("YIl giriniz");
          int yil=scan.nextInt();
          
          if (yil%100==0 && yil%400==0 ) {
        	     
              System.out.println("artik yildir");	 
          }else if ( yil%100!=0 && yil%4==0) {
        	  System.out.println("Artik yildir ");
          }else {
        	  System.out.println("Artik yil degildir ");
          }
      
	}

}
