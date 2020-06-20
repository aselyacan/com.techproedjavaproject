package day14dowhileloop;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		/*kullanicidan ismini alin 
		 * 
		 * ilk harf  buyuk harf ise " Dogru giris yaptiniz"
		 * ilk harf kuck har ise  " ILK HARFI  BUYUK HARF  OLARAK GIRINIZ"
		 */
        

		
		Scanner scan=new Scanner(System.in);
		
		String isim="";//  string de 0  a esit 
		
	   do {
			System.out.println("ilk isminizi girin ");
			
			isim=scan.nextLine();
			
			if(  isim.charAt(0)>='A'&& isim.charAt(0)<='Z') {
				System.out.println("dogru giris  yapiniz");
			}else {
				System.out.println("ilk harfi  buyuk harf  olarak giriniz ");
			}
			
			
		}while(!(isim.charAt(0)>='A' && isim.charAt(0)<='Z'));
		
		
		
		
	}

}
