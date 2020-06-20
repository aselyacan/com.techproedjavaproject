package day21multidimensionalarray;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOdev {

	public static void main(String[] args) {
		/*1) Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız.
          2) İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.
            İndex’li add() methodunu kullanarak, L’yi 1 numaralı index’e ekleyiniz.
            ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B.
            
            3) set() methodu kullanarak, E’yi D yapınız.
            ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, F, B.

            4) remove() methodu kullanarak, F’yi siliniz.
            ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, B.
            
            5) sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
            ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
            6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de
            var olmadığını doğrulayınız.
            7) size() methodu kullanarak, list’in kaç eleman olduğunu ekrana yazdırınız.
            8) clear() methodu kullanarak, list’deki tum elemanları siliniz.
            9) isEmpty() methodu kullanarak, list’deki tum elemanların silindiğini doğrulayınız
		 * 
		 */
		
		List<String> kelime=new ArrayList<>();
		
//		1)	Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız.
		kelime.add("A");
		kelime.add("C");
		kelime.add("E");
		kelime.add("F");
		
		System.out.println(kelime);
//		2)	İndexsiz add() methodunu kullanarak, B'yi ekleyiniz.

		kelime.add("B");
		System.out.println(kelime+"  B eklendi");
		
//		İndex'li add() methodunu kullanarak, L'yi 1 numaralı index'e ekleyiniz.
//		ArrayList'i ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B.
		
		kelime.add(1,"L");
		System.out.println(kelime+"  L eklendi ");
		
//  set() methodu kullanarak, E’yi D yapınız.
     //ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, F, B.
		
		kelime.set(2, "D");
		System.out.println(kelime+"  E nin yerine D geldi ");
		
		
//		4)	remove() methodu kullanarak, F'yi siliniz.
//		ArrayList'i ekrana yazdırınız, list şöyle olmalı; A, L, C, D, B.

		kelime.remove(4);
		System.out.println(kelime+"  F remove ile silindi");
		
//		5)	sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
		//ArrayList'i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L.
		
		Collections.sort(kelime);
		
		System.out.println(kelime+"  sort metodu ile collection dan alindi ");
		
//		6)	contains() methodu kullanarak, L'nin list'de var oldugunu ve M'nin list'de var olmadığını doğrulayınız.
		
		//kelime.contains("L");
		System.out.println(kelime.contains("L")+" //dogru yada yanlis contains medodu ile ");
		
		
//		7)	size() methodu kullanarak, list'in kaç eleman olduğunu ekrana yazdırınız.

		System.out.println("size yontemiyle uzunluk bulma "+kelime.size());
		
//		8)	clear() methodu kullanarak, list'deki tum elemanları siliniz.

		kelime.clear();
		System.out.println(kelime+"  clear ile hepsini silme ");
		
//		9)	isEmpty() methodu kullanarak, list'deki tum elemanların silindiğini doğrulayınız.
		
		System.out.println(kelime.isEmpty());

	}

}
