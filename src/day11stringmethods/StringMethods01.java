package day11stringmethods;

public class StringMethods01 {

	public static void main(String[] args) {
		// startsWith() methodu  bir string in istenenen harfle baslayip baslamadigini kontrol eder
		// istenen harle  basliyorsa  true ,  baslamiyorsa  false  return  eder yani sonuc verir 
		
		String str1="Ali Can";
		
		// startsWith() 1. version 
		
		System.out.println("A");// ekrana  true  yazdiracak  cunku  Ali buyuk A ILE BASLADI 
		
		System.out.println("B"); //  ekrana  false  verecek 
		
		System.out.println("a");  //  false  cunku java  case  sensitive dir  
		
		System.out.println("Ali");//  yani  indexOf yada lastOf da ki neyele baslayip baslamadingi kontrol eder  true 
		
		/////////////
		
	// 2.version 
		
		System.out.println(str1.startsWith("a" ,3)); // false  3 den 
		
		System.out.println(str1.startsWith("a" ,5)); //  true 5 den itibaren  kontrol ediliyor  a ile mi basliyor diye 
		
		System.out.println(str1.startsWith("Can" ,4));//treu  4 den itibaren kontrol ediliyor ....
		
		
		
		
		///////////
		//  endsWith() methodu 
		// bir  string in istenene harle bitip bitmedigini kontrol eder , bitiyorsa true, bitmiyorsa  false  return eder....
		
		
		String str2="Ayse Canan";
		
		char c='y';
		
		c=str2.charAt(4);
		
		System.out.println('y');
		
		System.out.println();
		System.out.println(str2.endsWith("n"));// true 
		
		
		System.out.println(str2.endsWith("Canan"));//true 
		
		System.out.println(str2.endsWith("CANAN")); // FALSE 
		
		
		//""  ve " " tamamiyla farklidir. ikincinin icinde bosluk var 
		
		
		String str3="Ali ";
		
		System.out.println(str3.endsWith(" "));// true almaliyim  cunku boslukla bitiyor  
		
		System.out.println(str3.endsWith(""));//  "" hic bir sey oldugu icin true  ""   
		
		System.out.println(str3.startsWith("") );// treu  cunku hic bir sey  yok 
		
		
		
		String a="Mustafa";
		
		String b=new String("Mustafa");
		
		System.out.println(b);
		
		

	}

}
