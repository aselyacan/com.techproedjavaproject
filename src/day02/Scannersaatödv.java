package day02;

import java.util.Scanner;

public class Scannersaatödv {

	public static void main(String[] args) {
	
		

		// Saati saniyeye  ceviren  bir program yaziniz(long)
		
		//not:1saniye:Saat*60*60
		
		
		Scanner ceviri=new Scanner(System.in);
		
		
		System.out.println("saati giriniz");
		
		
		long saat=ceviri.nextInt();
		
		
		
		System.out.println(saat*60*60);
		
		
		
	}

}
