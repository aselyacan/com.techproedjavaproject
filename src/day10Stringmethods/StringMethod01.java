package day10Stringmethods;

import java.util.Scanner;

public class StringMethod01 {

	public static void main(String[] args) {
		/*
		 * 1.medthod ...indexOf() methodu Stringn  icindeki  characterin yerini  belirlemek icin kullanilir 
		 * 
		 * 
		 */
		
		// indexOf birinci versiyonu 
		String str1="Javva Wordl";
		
		// V harfinin yerini belirleyecegim
		
		str1.indexOf('v');
		
		System.out.println(str1.indexOf('v'));
		
		// java icin index ler 0 dan baslar ... index  sayimi sifirdan baslar .
		
		System.out.println(str1.indexOf('w'));
		//ekrana 5 yazdirir  bosluklar da bir  index dir bir karakterdir 
		System.out.println(str1.indexOf('v'));
		// java  index bulamaz cunku  Java  "case sensitive " dir .
		// kucuk 'w' icin -1  return eder .. dondurur...karakter bulamayinca  -1 return eder
		
		System.out.println(str1.indexOf('a'));
		// Ekrana birden fazla  kullanilan characterler icin  java ilk charecter in index i verir .
		
		
		
		///////////////////////////////////// 2222222.version indextOf();
		// index() methodu  diger versiyonu  2
		
		
		System.out.println(str1.indexOf('a',2));  // String de ki ikinci 'a' characterinin  indexi ni bulunuz-...
		
		
		                                         // Ekrana 4 yazdirmali ..
		System.out.println(str1.indexOf('a',4));
		
		
		System.out.println(str1.indexOf('a',1)); // ekrana 1  yazdirilir 
		
		
		System.out.println(str1.indexOf('a',5));  // java -1 yazdirir . Cunku Strinde  'a' olmasinda ragmen  
		                                          // benim aramaya  basla dedigim yerde 'a' yok 
		
		
		// "Alamanya"  Stringinde ki ikinci 'a' karakterinin indexini bulunuz.
		
		
		String str2="Alamanya";
		System.out.println(str2.indexOf('a'));// Birinci 'a' nin indexi ==>2
		
		System.out.println(str2.indexOf('a',3)); // ekrana 4 yazdirmali // asagidaki kisa yol  int str2=str2.indexOf()
		
		int idx=str2.indexOf('a');
		
		System.out.println(str2.indexOf('a',idx+1));// ekrana 4 yazdirmali 
		// indexOf() methodunn  3 .versiyonu.....
		
		
		
		String str3= "Missisippi";
		
		System.out.println(str3.indexOf("is"));//  ilk   "is" String ni bulur ve ilk harfin  index ini  return eder.
		                   // bu ornekte  ilk "is " deki 'i' indexi olan 1 i return eder-
		
		
	// Girilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazını
		
		Scanner sc=new Scanner(System.in);
		System.out.println("kelime giriniz");
		String str=sc.nextLine();
		System.out.println("rakam giriniz");
		int num=sc.nextInt();
		
		System.out.println(num+" pozisyonunda ki karakter "+str.charAt(num));
		
		
		
		
		
		
		
	}

}
