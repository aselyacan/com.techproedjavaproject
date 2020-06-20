package day16Overloading;

public class Overloading02 {

	public static void main(String[] args) {
		//System.out.println(bolme(5,0));
		
		
	 }           // Note 1: Return type i degistirmek  overloading icin yeterli degildir
	             // java method larin farli olup olmadiklarini  anlamak icin iki seye bakar.
	                  //a)method ismine
	                 //b) parametrelere bakar 
	            
	          // Method ismi ve parametreler java icin method larin imzasi gibidir ...
	             // Java da method  imzasi yerlerine  methdo signature  denir...
                
	            // Note 2 Acces modifier lari degistimek de  methodlari  java acisindan  farkli hale getirmez
	             // cunku acces modifier lar  method signature  dahil degildir 
                 // Note  3 : Methodlarin  body sini degistirmek de  method lari  java acisindan farkli hale getirmez
	             /*
	              * cunku body  curly brase lerin ici  method signatur e dahil degildir 
	              * 
	              * Note 4  Siz daha yazarken  yani kodu calistirmadan  once java  sizi yaptiginiz  hatalardan dolayi  uyarirsa  bu tip hatalara  "compile derleme" hatasi denir 
	              * 
	              * Compile Time Erro denir 
	              * 
	              * Overloading Compile Time Error verir....onemli 
	              * 
	              * calistirirken  fark edilen hatalar Run Time Erro denir /// code  calistirdiktan sonra console de exception cikarsa  ...
	              */
	
//	               public static void carpma(int num1,int num2) {
//                	   System.out.println(num1*num2);
//                   }
//                   public static void carpma(int num1,int num2) {
//                	  return num1*num2;
//                   }
//                   private  static void carpma(int num1,int num2) {// private acces modifie dir public de  oyle bunlari degistirmek bir degisiklik anlaminda gelmez java icin 
//                 	  return num1*num2;
//                    }
//	             public static int bolme(int num1,int num2) {
//  	               return num1/num2;
//     }
    }

