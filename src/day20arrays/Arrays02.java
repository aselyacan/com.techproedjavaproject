package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

/*
 * Bir array in elemanlarini kucukten buyuge diziniz
 * ve ekrana  iki durumu da yazdiriniz  
 */
	
		int arr[]= {2,11,0,23,7};
		
		System.out.println("siralamadan once :"+Arrays.toString(arr));
		// Array.sort() methoduna parametre olarak arrarin ismi yazilirsa  o array in elemanlari kucukgten buyuge siralanir 
		
		Arrays.sort(arr);
		System.out.println("siralamadan sonra :"+Arrays.toString(arr));
		// kucukten buyuge dogru siralamaya  (ascending order  , natural order )  denir 
		
		// char lardan olusan bir String olusturunuz  ve ascending order yapiniz
		
		// Buyuk harler  Ascii  kodlari  kucuk harflerden azdir//
		// bu yuzden  siralamda  buyuk  harfler one gecer
		
		
		
		char arr1[]= {'a','f','1','A'};
		System.out.println("siralamadan once"+Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("siralmandan sonra:"+Arrays.toString(arr1));
		
		// Soru: String lerden olusan bir array  olusturun ve ascending  oder yapin 
		
		
		String arr2[]= {"Ali","Ahmet","Can","Beyza"};
		
		System.out.println(Arrays.toString(arr2)+"siralamdan once");
		
		Arrays.sort(arr2);
		System.out.println("siralamadan sonra:"+Arrays.toString(arr2));
		
		//soru boolean bir array olusturun  ascending   order yapin
		
		//boolean lar icin sort  methodu  kullanilamaz  yoktur cunku ...hocam
		
		
	}

}
