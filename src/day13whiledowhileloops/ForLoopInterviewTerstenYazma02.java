package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterviewTerstenYazma02 {

	public static void main(String[] args) {
		

		// Kullanicidan bir String alin ve bu String'i ekrana tersten yazdirin
				//While Loop kullanin
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Bir cumle veya kelime giriniz");
				
				
				String str= scan.nextLine();
//		        
//			     for	(int i=str.length()-1; i>=0; i--) {
//				
//				System.out.print(str.charAt(i)+" "); // Ali Can tersten naC ilA
//				
//				}
//
//	
				int  length=str.length()-1;
				
				while(  length>=0 ) {
					System.out.print(str.charAt(length)+" " );
					
					length--;
				}
				
				
				
        	}
	
		
	}

