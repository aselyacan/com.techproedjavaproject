package day35collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods01 {

	public static void main(String[] args) {
		//Elemanlari A, B,VE C olan Strinleri  olan bir list olusturunuz
		
		List<String> list =new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list+"yukarida list icine eklenen A B C yi yazidir");
		
		// list iterator olusturunuz :  elemanlar arasinda gezer ve onlari degistirebilir  yada update edebilir 
		
		
		
		ListIterator<String> listIterator=list.listIterator();
		
		// ListIteraort icinde  daha fazla metod var yukarida ki sekilde  gibi olusturulur 
		
		while(listIterator.hasNext()) { // iterator kullanirken her zaman while kullanilir  while in icine  listIterator ve hasNext kulalnilir 
			
			// iterator  list de elemanlari degistirmek icin kullaniriz ,, digerleri degistiremez 
			
			// hasNext  onunde eleman olup olmadigini sorar ve true verir 
			
			Object element =listIterator.next(); //  bu ise sonsuz donguyu  engellemek icindir  pointer bir sonraki elamanin uzerinde gecirir ve onu da yazdirir.  next  count++ gibi dir 
			// ilk donguden sonra  A ve bosluk elde edilir  
			// Object  ana  method dur yada hz adem dir 
			System.out.println(element+" ");
			
		}
		System.out.println();
		
		while (listIterator.hasPrevious()) {
		Object 	element=listIterator.previous();// geriye dogru  calistiricak ve ustunden gectigi elamani  return ettirecek 
		System.out.println(element+" ");
		}

		        //hasPrevious() ve previous() methodlarini kullanarak
				//bir listin elemanlarini tersten yazdirmak isterseniz mutlaka
				//once hasNext() ve next() kullanmalisiniz

	}

}
