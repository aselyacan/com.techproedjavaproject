package day08ternaryOperator;

import java.util.Scanner;

public class TenaryOperator01 {

	public static void main(String[] args) {
		/*Kullanicidan bir sayi aliniz 
		 * 
		 * sayi pozitif ise ekrana  "Pozitif"  yazdirin
		 * 
		 * sayi negatif ise  ekrana  Negatif yazdirin
		 * 
		 * 
		 * 
		 */
      // Garbage Collector diye  bir  method var heap memory deki  islevsiz funktionlari siler 
	  
		// finalize method ile islem yapar  garbage collector 
		//finalize () methodu  once garbage collector dan once calisir 
		// garbage collector finalize edilmis  seyleri  temizler 
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("bir sayi giriniz");
		
		int num=scan.nextInt();
		
		//if (num>=0) {
		//	System.out.println("Pozitif");
	    //	}else {
		//	System.out.println("Negatif");
	    //	}
		
		                                  // Ternary Operator:  (if else)
		
		   // Condition           Soru isareti     Conditioion  dogru ise  ,Iki nokta  ust uste  konuluacak herzaman 
	        String sonuc= (num>=0)          ?           "Pozitif veya 0"         :          "Negatif ";
	
	        System.out.println(sonuc);
		
	scan.close();
	}

}
