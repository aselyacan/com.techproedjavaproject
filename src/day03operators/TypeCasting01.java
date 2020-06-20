package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by1=101;
		
		short s=34;
		long l=s;
		int sayi=by1;//kucuk data tipini  buyuk data ya cevirmek icin extra bir kot yazmaya gerek yok 
		
		//bu isleme  (Auto Widening) denir  
		
		System.out.println(sayi);// ekranda  101  gormeliyim
		
		
		int sayi2=53;
		byte by2=(byte)sayi2;
		
		short sh=(short)sayi2;
		
		
		//Buyuk  data type  kucuk data type  cevirmek  JAVA  tarafindan  yapilmaz.
		
		// ornekteki  gibi  sag tarafa  donusturmek  istedigimiz  data type  
		// parantez icinde  yazmaliyiz.
		
		System.out.println(by2);
		
		double  sayi3=23.5;
		int by3=(int)sayi3;
		System.out.println(by3);//23
		
		
		
		
		
		float  sayi4=-23.9f;
		short by4=(short)-23.9f;
		System.out.println(by4);
		
		
		double sayi5=4.8;
		double sayi6=1.4;
		double sonuc1=sayi5/sayi6;
		System.out.println(sonuc1);
		
		
		int sonuc2=(int)  (sayi5/sayi6);
		
		System.out.println(sonuc2);
		
		
		int sayi7=5;
		int sayi8=3;
		
		int sonuc3=sayi7/sayi8;
		System.out.println(sonuc3);
		
		
		
		
		
		
		int sayi9=255;
		byte by5=(byte) sayi9;
		System.out.println(by5);//255 
		
		//normalde  byte'ta 256 tane sayi var (-128....-1.-0.1....127)
		//   bu yuzden  -1 ekrana yazilir
		
		
		int sayi10=556;
		byte by6=(byte) sayi10;
		System.out.println(by6);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
