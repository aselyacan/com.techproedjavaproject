package day16Overloading;

public class Overloading01 {

	public static void main(String[] args) {// overloading asiri yukleme demek tir 
		/*
		 * 
		 * iki sayinin  toplamini ekrana  yazdiran bir method olusuturun
		 * 
		 */
		//int num1=12;
		//int num2= 35;
		
		//toplam(num1,num2);
		// yada
		
		//String str="Ali";
		//str.
		
		toplam(2,3);// gibi de method cagirma olur // method 1
		toplam(7);                                 // method 2
		toplam(2.3,4);                             //method 3 
		toplam(5,3.9);                             // method 4
	}
	// Methodun body kismini  degistirmek  yeterli  degil 
	
	// Overloading yapma  yontemleri
	
	// 1 parametrelerin  sayisini  degistirerek  ayni isimle method  olusturabiliriz 
	
	// 2 Parametre sayisini degistirmeden herhangi bir parametrenin data type ni  degistirerek de  ayni isimle method lar olusturabilirsiniz 
	
	// java yukaridan asagi  soldan saga islem yapar .....
	//  bire bir uyana bakilir yoksa auto widining  yapar  ...int int method da yoksa  double int auto weidining yapar
	// Note toplam(2.3); cagrisi  toplm(int num1 ,int num2); var oldugu surece 
	//toplam(int num1, int num2); yi kullanir  cunku  argument  data type ile parametre  
	// data type birebir  ortusuyor ...
	// fakat  birebir ortusen data type  yoksa  auto wideninge  gore  java  kullanacagi  methodu  secer.
	// auto widening gore kullanabilecegi  method yoksa  hata verir ...
	
	// 3 farkli data type in deki parametrelerin yerlerni  degisitrerek de ayni isimli   methodlar olusturabilirsiniz 
	
	             // method 1
                  public static void toplam(int num1,int num2) {
	               System.out.println(num1+num2);
	  
  }
                  // method 2
                public static void toplam(int num1) { //   iki parametre de asagida ki ve yukaridakiler  ayni ve sayisi  olamaz  cunki karar veremez java
	              System.out.println(num1+num1);
	  
  }
                // yerleri degisen data type  ile farkli ayni isimde method kullanilabilir 
                // method3
               public static void toplam(double num1,int num2) {
	            System.out.println(num1+num2);
}
               // method4
               public static void toplam(int num1,double num2) {
   	            System.out.println(num1+num2);
   	            
   } 
  
}