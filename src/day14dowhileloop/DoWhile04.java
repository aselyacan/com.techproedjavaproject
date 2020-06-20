package day14dowhileloop;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// Kullanicidan  bir String alin bu String in index i tek sayi olan characterlerini ekrana yazdirin
		
		// almanya  ==> l,a,y  indexi  tek olanlari yazdirilacak 
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime giriniz veya  cumle giriniz ");
		String str=scan.nextLine();
		
		
		int lenght=str.length();
		int i=1;
		do {
			
			if (i%2==1) {
				System.out.print(str.charAt(i));
			}
			i++;
		}while(i<lenght);
		
		
		
		

	}

}
