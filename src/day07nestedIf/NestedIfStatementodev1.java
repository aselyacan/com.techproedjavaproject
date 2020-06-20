package day07nestedIf;

import java.util.Scanner;

public class NestedIfStatementodev1 {

	public static void main(String[] args) {
		// 
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz:");
		String gen = scan.next();
		
		System.out.println("Lutfen yasinizi giriniz:");
		int yas = scan.nextInt();
		
		if(gen.equalsIgnoreCase("male") ) {
			if(yas>=0 && yas<18) {
				System.out.println("Erkek cocuk");
			}else if(yas>=18){
				System.out.println("Adam");
			}else {
				System.out.println("Gecersiz giris yaptiniz.");
			}
		}else if(gen.equals("female")) {
			if(yas>=0 && yas<18) {
				System.out.println("Kiz cocuk");
			}else if(yas>=18) {
				System.out.println("Kadin");
			}else {
				System.out.println("Gecersiz giris yaptiniz");
			}
		}else {
			System.out.println("Bilgileri yanlis girdiniz tekrar deneyiniz");

		}
	}

}
