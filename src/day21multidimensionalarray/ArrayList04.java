package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		/*
		 *[ A , C, B, C ] listini olusturun 
		 */

		List<String> list= new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		// list de elaman B var mi ?
		
		
		System.out.println(list.contains("B")); //  Eger B elemani  varsa true ,  yoksa  false return eder 
		
		// list de  elaman olarak Z  var mi?
		
		System.out.println(list.contains("Z"));// false verir  cunku Z yoktur 
		
		
		//  list de ki eleamnlari alfabatik siraya koyunuz 
		 
		// collection bir araya getirilmis  parcalar 
		Collections.sort(list);
		System.out.println(list); // A B C C 
		
	}

}
