package day09Switchoperator;

import java.util.Scanner;

public class SwitchtTekrar2 {

	public static void main(String[] args) {
		//
		// Kullanici ay ismini girsin 
				// program kacinci ay oldugnu  ekrana yazsin 
				//Buyuk harf  kucuk harf hepsi icin calissin 
				// Yanlis ay ismi girerse "Gecerli ay ismi giriniz " mesaji versin

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir ay ismi giriniz ");
		
		String ay=scan.next();
		
		ay=ay.toLowerCase();
		
		switch(ay) {
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
		case "mayis":
			System.out.println("5");
		break;
		case "haziran":
			System.out.println("6");
		break;
		case "temmuz":
			System.out.println("7");
		break;
		case "agostos":
			System.out.println("8");
		break;
		
		default:
			System.out.println("boyle bir ay yok ");
			
		}
		
		
		
		
		
	}

}
