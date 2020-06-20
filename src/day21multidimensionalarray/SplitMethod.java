package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		/*
		 *Split  konusu onemlidir .. iki kisilikli yada bolunme 
		 * 
		*/
		
		
		//Split() methodunu kullandimizda mutlaka bir array olusturmamiz gerekiyor cunku o  elemanlari parcaliyor ve bir yere koymamiz gerekiyor 
		String str="Ali Can okula basladi , nasil oldu? Iyi oldu ama zor.";
		
		String kelime[]=str.split(" ");// String array olusturduk 
		
		                // ALi Can okula basladi kelimeleri var ve havada ...
		
		System.out.println(Arrays.toString(kelime));
		
		System.out.println("Kelime sayisi"+kelime.length); // kelima sayisi 
		
		// harf sayisini bulma methodu 
		String str1="Kahramanmaras";
		String harf[]=str1.split("");  // "" char yada string de hic bir sey demektir  ...0 demektir
		System.out.println(Arrays.toString(harf));
		System.out.println("Harf sayisi:"+harf.length);
		
		
	}

}
