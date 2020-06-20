package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		/*Map bir Interface dir ... Map interface nin 3 tane child class i vardir .
		 * 
		 * 1) HashMap =====>HashMap key- value yapisini kullanilir .Key ve value  programci tarafindan yazilir 
		 *    Key ve value de null degeri kullanilabilir ...Key de 1 den fazla null degeri kullanilirsa Java son kullanilan null i kabul eder .
		 *    Value de birden fazla  null degeri kullanilabilir 
		 *    HashMap console yazdirildiginda hem key degerleri hem de value degerleri aralarina = esittir sembolu konularak yazdirilir .
		 *    HashMap ler ekrana yazdirirken  rastgele siralama yapar.. 
		 *    HashMap classlar arasinda en hizlidir ama siralam rastgele yapar 
		 *    
		 *    hashMap ler  thread safe degildir ...
		 *    / HashMap’ler “therad safe�? değildir. Bazen bir application’da aynı anda iki birlikte çalışır.
	          // bir application buna müsaitse buna “thread safe�? deniyor, yani aynı anda başka şeyler yapabiliyor. 
		 */
		
		HashMap<Integer, String > hashMap=new HashMap<>();// artik bir hashMap objemiz var 
		
       hashMap.put(3, "Ali");
       hashMap.put(1, "Veli");
       hashMap.put(2, "Mine");
       hashMap.put(4,"Kemal");
       System.out.println(hashMap);// {1=Veli, 2=Mine, 3=Ali} ciktisi  seklinde olur aralarina = sembolu  olur 
       
     //  hashMap.remove(4);// kemal silinir
       System.out.println(hashMap.remove(4));

       System.out.println(hashMap);//{1=Veli, 2=Mine, 3=Ali}
       
      System.out.println( hashMap.remove(1, "Veli"));//  sadece  olmus olayin dogru oldugunu ve  true yazar yada  false 
      System.out.println(hashMap.remove(22, "Ayse"));// False cunku   22 ayse  yoktur 
      System.out.println(hashMap); // {2=Mine, 3=Ali}
      
      System.out.println(hashMap.get(2));//  Mine yi verir...
      
      System.out.println(hashMap.keySet());  // [2, 3] sadece  key lari gormek istendidiginde  keySet methodu var 
      
      System.out.println(hashMap.values());// sadece Value lari  elde etmek yada gormek icin  o method kullanilir    ..[Mine, Ali]
      System.out.println(hashMap.size());//  map in icinde ki var olan elaman sayilarini gosterir   2 tane var 
      System.out.println(hashMap.containsKey(3));// true  verir  key olarak 3 var mi sorunusu yanitlar 
      System.out.println(hashMap.containsKey(5));//  false verir cunku bizde  key olarak  5 yok ...
      
      System.out.println(hashMap.containsValue("Mine"));// True  dondurur  
      System.out.println(hashMap.containsValue("Emin")); // False dondurur  
      
      hashMap.clear(); // clear  methodu  void  return eder ve syso un icine yazilmaz 
      System.out.println(hashMap);//{}  bosalmis  olarak cikti olur 
      
	}

}
