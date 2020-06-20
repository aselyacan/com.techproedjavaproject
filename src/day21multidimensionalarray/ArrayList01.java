package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		/*
		 * 
		 * Array  ve Array List arasinda ki farklar  Mulakat sorusu 
		 * 
		 * Arraylar de  length sabittir ve degistirilemez
		 * 
		 * Arraylistlerde  length  esnek tir sabit degildir 
		 * 
		 * Siz  eleman  ekledikce  List LENGTH ini arttirir
		 * 
		 * Siz eleman sildikce  list length ini azaltir..
		 * 
		 */
		
		//int arr[]= {1,2,3};
		
		//
		
		//Constructor01 obj1=new Constructors01();   // burada  isimler ayni constructor olusturuken yada obje olusturuken 
		
		List<String> list1=new ArrayList<>();   // list de  aslinda bir obje dir ama isimler ayni degildir 
		
		
		System.out.println(list1);
		// List e  eleman eklemek icin add() medthodu kullanilir 
		
		list1.add("iskender");
		System.out.println(list1);
		
		
		//once eklenini one koyar list 
		
		list1.add("demirkan");
		System.out.println(list1);// iskender , demirkan seklinde ekran ciktisi olur 
		
		list1.add(1,"Veli");
		System.out.println(list1);
		
		//ArrayList<String> list01= new ArrayList<>();  =====> bu da olur ama yukarida ki daha az yazildigi icin tercih  edilir 
		
		//List<String> list01=new ArrayList<String>();  =====> bu olur ama yine de yukarida ki tercih edilir 
		
		
		list1.add(0,"Han");
		System.out.println(list1);
		
		
		list1.add(2,"Kemal");
		System.out.println(list1);
		list1.add("Ayse");
		
		System.out.println(list1);
		
		// list1 in  eleman sayisini ekrana yazdirin  bu size() methdo ile olur 
		
		System.out.println(list1.size());// 6 verdi eleman sayisi  6
		
		// arrayler de  lenght methodu  list ler size  methodu kullanilir 
		

	}

}
