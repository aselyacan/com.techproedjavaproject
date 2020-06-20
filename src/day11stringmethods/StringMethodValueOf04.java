package day11stringmethods;

public class StringMethodValueOf04 {

	public static void main(String[] args) {
		// 

		
		
		//valueOf() rakamlarla  oluruturan  Stringleri  sayiya donusturur .
		// Boylece  rakamlarla olusturulan  matematiksel islemler yapabilmemizi saglar 
		// String  java icin  bir resim demektir
		// valueOf() hem Integer  Wrapper classinin icinde hemde  String icn icinde var ..
		// Inter Wrapper classinin icin olan valueOf() methodu  String i  Integer e caririr
		// String in icinde ki valueOf() methodu intger  i  String'e cevirir/
		
		String paraErkek="1900";
		
		String paraKadin="2000";
		
		//  bu ailenin toplam gelirini bulunuz 
		
		System.out.println(paraErkek+paraKadin);// 19002000  olur cunku concetenation yapistirma  yapar/
		
		System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKadin));//3900  
		
		int maasErkek=1900;
		int maasKadin=2000;
		
		// maasErkek ve maasKadin sayilarini  String e  donusturun ve concantenantion yapin 
		
		System.out.println(maasErkek+maasKadin);// 3900 cunku yukarida  inter olarak  yer aliyor
		
	    System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKadin));// 1900200 
	  
	  // butun bunlari ezberlemek zor  olabilir onun icin  java nin ne yapabildigini  bilmek ve  onu google de  buluna bilir...
		
		
		

	}

}
