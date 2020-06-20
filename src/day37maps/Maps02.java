package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		// HashTable : HashMap  ile hemen hemen   aynidir
		 /* 1)HashTable console'a yazdirildiginda HashMap gibi 
         *            rastgele siralamada yazdirilir
         *            Farklari:
         *            1) HashTable key ve value'larda null'a musaade etmez.
         *            2) HashTable thread safe'dir.Bir kac isi ayni anda yapabilir.
         *            3) HashTable daha yavastir.

		 */

		
		Hashtable<String, String> hTable=new Hashtable<>();
		hTable.put("Dil", "Kalp");
		hTable.put("Gonul", "Kalp");
		hTable.put("Dil", "Tat alma organi");
		hTable.put("Ali", "");  // sorun olmaz cunku hic bir sey  ifadesi iki tirnak isareti arasinda ki 
		
		// ayni key value  kullanirsaniz   son value yu  kabul eder 
		
		// hTable .put(null,"agizlik")  ==>  Run Time Error verir 
		
		System.out.println(hTable);//{Dil=Tat alma organi, Gonul=Kalp}
		
        //HashMap'de kullandigimiz methodlarin tamami HashTable'da da kullanilir
	}

}
