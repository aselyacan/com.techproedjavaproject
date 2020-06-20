package day20arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		/*Bir array in icinde  belli bir elemanin  var olup olmadigini  kontrol ediniz 
		 * 
		 *binarySearch() methodu bu is icin kullanilir  
		 * O
		 * Oneml not:binarySearch() methodunu  kullanmadan once sort() methodunu kullanmak zorundasiniz
		 * 
		 * Aksi takdir de binarySearch() methdodu  anlamli bir sonuc vermez , rastgele sonuc verir
		 * 
		 */
		
		
		int arr[]= {1,12,12,2,3};
		
		// yukarida  verilen array  de 3 eleman olarak var mi ?
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr,3));//2
		
		//  binerarySearch() aranan eleman var oldugunuda  o elamanin indexini return eder...
		System.out.println(Arrays.binarySearch(arr,12));//3
		// ayni elemandan birden fazla  oldugunda  ilkinin indexini verir
		
		System.out.println(Arrays.binarySearch(arr,5));// negatif sayilar return eder -4 verir 
		// 3 den hemen sonra  olurdur, bu da  4. eleman  olacak demektir...
		
		//negatif olmasi o elemanin array da olmadigi anlamina gelir
		// sayi kismi ise o eleman  var  olsaydi  kacinci eleman oldugu anlamindadir //////
		


		 int arr1[]={1551,1223,1443,1267,1789,1023,2020};
		 
		 Scanner sc=new Scanner(System.in);

		int key=sc.nextInt();
		 
		 for( int i=0; i<=arr1.length; i++) {
			 if( i==arr1[i]) {
				 System.out.println("true");
			 }else {
				 System.out.println("false");
			 }
		 }

		
		 
		
		
	}

}
