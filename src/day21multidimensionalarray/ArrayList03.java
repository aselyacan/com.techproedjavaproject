package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [ Ali  , Can ,Ayse, Ali] olusturun
		
		List<String> list01=new ArrayList<>();
		
		list01.add("Ali");
		list01.add("Can");
		list01.add("Ayse");
		list01.add("Ali");
		
		System.out.println(list01);
		
		list01.remove("Ali");
		System.out.println(list01);
//		list01.remove("Ali");
//		System.out.println(list01);
//		
		list01.remove("Kemal");    // remove() methodu  listde olmayan eleamnlar icin hata vermez 
		System.out.println(list01);
		
		
		System.out.println(list01.remove("Ali"));//true 
		
		System.out.println(list01.remove("Kemal"));// false 
		
		
		System.out.println(list01.remove(0)); // bu  Can elemanini  sile ve ekrana silinen elemani yazar
		
		
		// Ayse elemanini  Ayse Teyze yapalim 
		// var olan bir elemani update  edecegiz
		
		// bunun icin set methodu kullanilir 
		
		list01.set(0, "Guzel Banu");
		
		System.out.println(list01);//  Guzel Banu ye donustu
		
		// Liste  Kenan ve Zeynep  ekleyin
		
		
		list01.add("Kenan");
		list01.add("Zeynep");
		System.out.println(list01);// Guzel Banu , Kenan , Zeynep
		
		// hepsini temizleme method u  clear() dur 
		
		list01.clear();
//		System.out.println(list01);//[] bos olur 
//		
		System.out.println(list01.isEmpty());// true   code dogrulamak icin 
		System.out.println(list01);
		
		
		
		
		
	}

}
