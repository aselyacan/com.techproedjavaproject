package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
       
     /*Kullanıcıdan kaç elemanlı bir array girmesini  isteyin.
        Bu array’i olusturup  tum elemanlarını ekrana yazdırın.
        Bu arrayın ilk elemanını son eleman yapın ve tum elemanlarını ekrana yazdırın.
        Mesela; array {1, 2, 3} ise ekrana {2, 3, 1} seklinde yazdırın.
      * 
      */
	    Scanner scan=new Scanner(System.in);
		System.out.println("Kac elemanli bir  integer array  olusturmak istersiniz");
		int length=scan.nextInt();
		
		int arr[]=new int[length];
		
		System.out.println("Array  elemanlarini  giriniz ");
		
		for ( int i=0; i<length; i++) {
			arr[i]=scan.nextInt();
		
		}
		//Arrays.toString() methodu na parametre olarak  arrayin ismini yazarsaniz 
		// tum elemanlarini ekranda gorurusunuz
		
		System.out.println(Arrays.toString(arr));	// Array classinin icinde olan bu formulle tum elemanlari ekrana yazabiliriz
		
		// yeni bir array olusturmamiz gerekiyor
		
		int arrSon[]=new int[length];
		
		for (int i=1; i<length; i++) {
			
			arrSon[i-1]=arr[i];
			
		}
		arrSon[length-1]=arr[0];
		System.out.println(Arrays.toString(arrSon));
		
		// return left  sola dogru don oyunu seklinde 
		
	}

}
