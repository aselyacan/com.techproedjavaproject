package day34collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorVeForEachLoop {

	public static void main(String[] args) {
		
		
		List<String> list1=new ArrayList<>();
		
		list1.add("x");
		list1.add("y");
		list1.add("z");

		System.out.println(list1);// [x,y,z] olmali  listleri ekrana yazdirmak icin  list1  syso icine koymak yeterlidir 
		
		Iterator<String>  iterator=list1.iterator();
		
		
		// hasNext()  methodu  bir sonraki eleman var olup olmadigini kontrol eder .
		// ==> x,y,z nin basinda hasNext bekler ve  bir eleman olup olmaidinig kontrol eder 
		
		//  asagidaki method  butun elemanlari ekrana yazdirma yarar
		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		
		
		// for each loop ile  ekrana yazdirma   
		System.out.println();
		
		
		for (String w:list1) {
			System.out.println(w);// 
		}
		for (String w:list1) {
			w=w+"A"; 
		}
		System.out.println(list1);//  degisim  gerceklemedi  hala  cikti xyz  seklinde ..  
		
		
		// iterator ile for each farki 
		while(iterator.hasNext()) {
		       iterator.next();
		       iterator.remove();// methodun tum elemanlarini siler 
		       
		}
		System.out.println(list1);// bir collection da ki  bir degisimin  kalici olmasini istenyorsa  itertor kullanilmali 
		

		
		
		
		
 	}

}
