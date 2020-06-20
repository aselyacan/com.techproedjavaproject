package day10Stringmethods;

import java.util.Scanner;

public class StringMethogBuyukharfsorusu1 {

	public static void main(String[] args) {
		// kullanicidan ilk ve soy ismini alin ve  ilk ve soy isminin Buyuk  harf olarak  ekrana yazin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ");
		
		String isim=scan.nextLine();
		
		String trim=isim.trim();
		trim=trim.toUpperCase();
		
		System.out.println(trim.charAt(0));
		
		
		System.out.println("lutfen soy adinizi girin");
		
		String soy=scan.nextLine();
		
	    String trim1=soy.trim();
	    
	    trim1=trim1.toUpperCase();
	    
		System.out.println(trim1.charAt(0));
		
		
		       String str ="Cat, caterpillar";
				
		       System.out.println(str.indexOf("c"));
		       System.out.println(str.indexOf("cat"));
		       System.out.println(str.indexOf("s"));
		       System.out.println(str.indexOf("CAT"));
		       System.out.println(str.indexOf("ter"));
		       System.out.println(str.indexOf("pars"));
		       System.out.println(str.indexOf("a" , 3 ));
		       System.out.println(str.indexOf("at", 2));
		       System.out.println(str.indexOf("at", 8));
		       
		       System.out.println("ilk hal ve sonrasi ");
		       
		        System.out.println(str.toUpperCase());
				System.out.println(str.toLowerCase());
				System.out.println(str.substring(4).toLowerCase());
				System.out.println(str.substring(0).toUpperCase());
				System.out.println(str.toUpperCase().toLowerCase());
		
		
	}

}
