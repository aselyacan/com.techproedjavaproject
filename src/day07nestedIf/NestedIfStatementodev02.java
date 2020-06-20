package day07nestedIf;

import java.util.Scanner;

public class NestedIfStatementodev02 {

	public static void main(String[] args) {
//		Kullanıcıdan bir harf girmesini isteyin.
//		Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
//		“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
//		Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
//		“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir harf giriniz.");
		char harf = scan.next().charAt(0);
		
		
		if(harf>96 && harf<123) {
			if(harf==97) {
				System.out.println(harf + " ilk kucuk harftir.");
			}else {
				System.out.println(harf + " ilk kucuk harf degildir.");				
			}
		}if(harf>64 && harf<91) {
			if(harf==90) {
				System.out.println(harf + " son buyuk harftir.");
			}else {
				System.out.println(harf + " son buyuk harf degildir.");				
			}
		} 
		
		scan.close();


	}

}
