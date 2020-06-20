package day09Switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		// 
		
	/* 
	 * A harfini bulunca  ilk harf
	 * B harfini bulunca ikinci harf
	 * C harfini bulnca  ucuncu harf
	 * D harfini bulunca dorduncu harf yazdiran programi (if else if  ve switch kullanarak  yaziniz...
	 */
		
		char harf='C';
		
		// 1, yol ==> if else if kullanallalim..
		
//		if (harf=='A') {
//			System.out.println("Ilk harf");
//		}else if(harf=='B') {
//			System.out.println("ikinci harf");
//		}else if (harf=='C') {
//			System.out.println("Ucuncu harf");
//		}else if (harf=='D')  {
//			System.out.println("Dorduncu harf");
//		}else {
//			System.out.println("Baska bir harf ve bilmiyorum");
//		}
		
		
		// 2. yol  ==> switch  kullanmak 
		
		       switch (harf) {  // okunmasi  daha kolay  ve yazmasi  da  kisa dir ...iki den fazla  else if varsa  switch kullanilir ...  aksi takdirde garipserler 
		      
		       case 'A':
		    	   System.out.println("ilk harf");
		           break;  // ;  islem bitti demek  is bitti birak demek tir.....
		       case'B':
		    	   System.out.println("ikinci harf");
		    	   break;
		    	   
		       case'C':
		    	   System.out.println("ucuncu harf");
		           break;
		       case'D':
		    	   System.out.println("dorduncu harf");
		    	   break;
		    	   
		        default:     // else  neyse  if else de  default da  switch de aynidir ... son islem demektin 
		    		   System.out.println("Bilmiyorum");
		    	   
		    	   
		    	   
		 }
		
		
		
		
	}

}
