package day36collections;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet 1)Tekrarli eleman kullaniminia(Dublication) a izin vermez.
				// 		  2)Key-Value yapisini kullanir. Ley'ler ve Valuelar HashSet icin uniqe'dir.
				// 		  Normalde; Key'ler her zaman unique dir Value'lar  Kullanilan class'a 
				//		 bagli olarak unique olabilir veya olmayabilir.Kullanilan class HashSet ise
				//		 Value'lar da unique olur ama ArrayList ise unique olma zorunlulugu yoktur.

		
		
		HashSet<String> hSet=new HashSet<>();
		
		hSet.add("Apple");
		hSet.add("Mango");
		hSet.add("Giresun");
		hSet.add("Apple");// ayni eleman  HashSet e eklendiginde  Compile Time veya Run Time error vermez , son eklenen eleman ilk eklenin ustune yazilir 
		hSet.add("Grape");
		hSet.add("Orange");
		hSet.add("Fig");
		// listlerde add() methodu hep yeni  elemani sona ekler ama HashSet lerde boyle bir zorunluluk yok 
		// HashSet ler elemanlari rastgele dizer...
		// HashSetler  elemanlari yazdirmak icin kural yoktur 
		System.out.println(hSet+" hSet  hashset ciktisi add ile ekleme yapildi ");
		
		System.out.println(hSet.hashCode()); // -15546960

		
	}

}
