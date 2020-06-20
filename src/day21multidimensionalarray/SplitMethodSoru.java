package day21multidimensionalarray;

import java.util.Arrays;

public class SplitMethodSoru {

	public static void main(String[] args) {
		/*
		 * Verilen bir cumledeki  bosluklar kelime sayisini bulunuz 
		 * 
		 */

		String str="Verilen bir cumledeki bosluklar haric  character sayisini bulunuz";
		
		str=str.replace(" ", "");// charecteri yok etmek icin replace() methodu  ile yapilabilir 
		
		String harf[]=str.split("");
		
		System.out.println(Arrays.toString(harf));
		System.out.println("charecter sayisi"+harf.length);
		
		
		//Ozkan beyin Ways
		// Bosluk sayisi kelime sayisindan bir azdir 
		// Bosluk sayisi= kelime sayisi -
		
		String str1="Verilen bir cumledeki bosluklar haric  character sayisini bulunuz";
		String  kelime[]=str1.split(" ");
		
		int boslukSayis=kelime.length-1;
		System.out.println(boslukSayis);
		
		String charecter[]=str1.split("");
		
		System.out.println(charecter.length-boslukSayis);
		
		
	}

}
