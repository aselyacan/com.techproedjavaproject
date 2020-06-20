package day10Stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		// charaAt() methodu belli  indexte ki characteri  return eder.
		
		String str1="cimbombom";
		// str1 in 4. index in deki characteri  bulan code yaziniz
		
		System.out.println(str1.charAt(4));
		// indexi 4 olan character  'o' harfidir , bu yuzden  ekrana 'o yzadirir 
		//// Kullanicidan  char almak icin next().charAt(0) kullanilabilir .
		
		System.out.println(str1.charAt(0));// index 0 ilk harf demektir bu yuzden c return eder...
		
		System.out.println(str1.charAt(6)); //  olmayan bir index  ile islem  yapmaya  calsirsanir  console  Exception alirsiniz. Bu da buyuk bir hata yaptiniz.
		
		
     // length() methodu  String  icnde  kac character odlugnu verir.
		
		//  sayarken 1 den  baslar 
		
	// length herzaman 1  buyuktur index den ...
		
		System.out.println(str1.length()); // ekrana  9 yazdirir.
		
		// Soru: son index 9  olan bir String lenght  i kactir .?
		// cevap: 9+1=10 
		// length =son index+1
		
		
		
		// Kullanicidan ismini girmesin isteyin
        // isminin son harfini  ekrana yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("adinizi giriniz");
		String isim=scan.nextLine();
		
		int lenght=isim.length();  //  uzunlugunu bulmak icin integer ile hesaplanir 
		
		System.out.println(isim.charAt(lenght-1));
		
		
		
		scan.close();
		
		
		//lastIndexOf() belli bir harfin indexini verir, harfin ne oldugunu bilmediginiz durumlarda calismaz
		
		
	
		
		
		
		
	}

}
