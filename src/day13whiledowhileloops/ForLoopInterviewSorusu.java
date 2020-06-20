package day13whiledowhileloops;

import java.util.Scanner;

public class ForLoopInterviewSorusu {

	public static void main(String[] args) {
		// Kullanicidan  bir String alin ve bu String i  ekrana tersten yazdirin
		
		// cok onemli bir soru 
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir cumle veya kelime giriniy");

		String str=scan.nextLine();
		// Ali Can ===> naC ilA for yada  while ile olur dongu oldugu icin 
		
		//str.charAt(6)  karekter gorutelemek icin ....
		
		for (int i=str.length()-1; i>=0; i-- ) {
			
			System.out.print(str.charAt(i));// naC ilA  yazilir 
    	    	}
		
		
		
		
		
		
	}

}
