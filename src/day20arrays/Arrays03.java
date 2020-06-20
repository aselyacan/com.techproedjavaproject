package day20arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		/*iki array olusturup bu array lerin bir birine esit olu olmadigini kontrol ediniz
		 * 
		 * Not: iki array in esit olmasi icin 
		 * 1 elemanlar ayni olmali 
		 * 2 esit elemanlarin  index leri de esit olmali 
		 * 
		 * ornek :{1,2,3} ve {1,2,3} esittir ...
		 * 
		 */
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		System.out.println(arr1==arr2);// false  verir  cunku steak da  reference lar farkli 
		
		// iki array farki objcet  oludugundan adresleri faklidir 
		
		
		System.out.println(Arrays.equals(arr1,arr2));// true verir  cunku 
		                                // Arrays.equals() methodu  sadece degerleri ve indexleri kontrol eder 
		                                // referenclere bakmaz 
	}

}
