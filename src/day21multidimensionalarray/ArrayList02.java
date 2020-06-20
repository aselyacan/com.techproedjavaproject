package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//  list olusturun isim list01  olsun elemanlar  integer olsun
		// list ler de  data type olarak primitivleri kabul etmez 
		// primitivlerde  data type ini  non primitive  yapmak icin wrapper  class lari  kullaniriz 
		
		List<Integer> list01=new ArrayList<>();
		
		// bu list in icinde  elaman olup olmadigini  kontol  edin. isEmpty() methodu kullanilir
		//isEmpty() methodu  list  bos ise true  , dolu ise  false  return eder ...
		
		System.out.println(list01.isEmpty());// true 
		
		// bu liste  bir eleman  ekleyin  ve tekrar    isEmpty() kullanin
		
		list01.add(123);
		System.out.println(list01.isEmpty());// false
		
		// list den elaman silmek  bunun icin   remove()  methodu  kullanilir 
		
		list01.add(124);
		list01.add(125);
		list01.add(124);
		
		System.out.println(list01);
		
		
		// index  kullanilarak silme  medhodu
		
		list01.remove(1);// index i 1 olan eleamni siler 
		System.out.println(list01);// index i bir olan elamani sildi 
		
		// 123  silin 
		
		list01.remove(0);
		System.out.println(list01); // ekran da 124  ve 125  kalir 
		
		// List de ki  son elamni  silin 
		
		//  size  list de uzunluk demek  size-1 de list de son eleman demektir 
		
		list01.remove(list01.size()-1);
		System.out.println(list01);

		
		
		
		

	}

}
