package day09Switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// Kullanici ay ismini girsin 
		// program kacinci ay oldugnu  ekrana yazsin 
		//Buyuk harf  kucuk harf hepsi icin calissin 
		// Yanlis ay ismi girerse "Gecerli ay ismi giriniz " mesaji versin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ay ismi giriniz");
		String ay=scan.next();
		
		ay=ay.toLowerCase(); 
		
		
		                      //  toLowerCase  kucuk harfe  cevirme metodo , kullanicin girdigi  Stringin kucuk harfe cevirmek icin kullanilir
		                      // toUpperCase  String'leri buyuk harfe cevrimek icin kullanilir 
		                      //  switch de  sadece harflerin buyuk yada  kucuk hassasiyetini yok etmek icin 2 metod  kullanilir ..
		
		switch (ay) {
		case "ocak":
			System.out.println("1");
		break;
		case "subat":
			System.out.println("2");
		break;
		case "mart":
			System.out.println("3");
		break;
		case "nisan":
			System.out.println("4");
		break;
		case "mayin":
			System.out.println("5");
		break;
		case "haziran":
			System.out.println("6");
		break;
		case "temmuz":
			System.out.println("7");
		break;
		case "agosto":
			System.out.println("8");
		break;
		case "eylul":
			System.out.println("9");
		break;
		case "ekim":
			System.out.println("10");
		break;
		case "kasim":
			System.out.println("11");
		break;
		case "aralik":
			System.out.println("12");
		break;
		
		default :
		System.out.println("gecerli ay ismi giriniz");
		
		}
		
		scan.close();
		
		
	}

}
